package com.example.study.service;

import com.example.study.model.entity.Partner;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.PartnerApiRequest;
import com.example.study.model.network.response.PartnerApiResponse;
import com.example.study.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerApiLogicService extends BaseService<PartnerApiRequest, PartnerApiResponse, Partner> {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Header<PartnerApiResponse> create(Header<PartnerApiRequest> request) {
        PartnerApiRequest body = request.getData();

        Partner partner = Partner.builder()
                .name(body.getName())
                .status(body.getStatus())
                .address(body.getName())
                .callCenter(body.getCallCenter())
                .partnerNumber(body.getPartnerNumber())
                .businessNumber(body.getBusinessNumber())
                .ceoName(body.getCeoName())
                .registeredAt(body.getRegisteredAt())
                .unRegisteredAt(body.getUnregisteredAt())
                .category(categoryRepository.getReferenceById(body.getCategoryId()))
                .build();

        Partner newPartner = baseRepository.save(partner);

        return response(newPartner);
    }

    @Override
    public Header<PartnerApiResponse> read(Long id) {

        return baseRepository.findById(id)
                .map(partner -> response(partner))
                .orElseGet(() -> Header.ERROR("data none."));
    }

    @Override
    public Header<PartnerApiResponse> update(Header<PartnerApiRequest> request) {
        PartnerApiRequest body = request.getData();

        return baseRepository.findById(body.getId())
                .map(partner -> {
                    partner.setName(body.getName())
                            .setStatus(body.getStatus())
                            .setAddress(body.getAddress())
                            .setCallCenter(body.getCallCenter())
                            .setPartnerNumber(body.getPartnerNumber())
                            .setBusinessNumber(body.getBusinessNumber())
                            .setCeoName(body.getCeoName())
                            .setRegisteredAt(body.getRegisteredAt())
                            .setUnRegisteredAt(body.getUnregisteredAt())
                            .setCategory(categoryRepository.getReferenceById(body.getCategoryId()));
                    return partner;
                })
                .map(newPartner -> baseRepository.save(newPartner))
                .map(partner -> response(partner))
                .orElseGet(() -> Header.ERROR("data none."));
    }

    @Override
    public Header delete(Long id) {

        return baseRepository.findById(id)
                .map(partner -> {
                    baseRepository.delete(partner);
                    return Header.OK();
                })
                .orElseGet(() -> Header.ERROR("data none."));
    }


    private Header<PartnerApiResponse> response(Partner partner){

        PartnerApiResponse body = PartnerApiResponse.builder()
                .id(partner.getId())
                .name(partner.getName())
                .status(partner.getStatus())
                .address(partner.getAddress())
                .callCenter(partner.getCallCenter())
                .partnerNumber(partner.getPartnerNumber())
                .businessNumber(partner.getBusinessNumber())
                .ceoName(partner.getCeoName())
                .registeredAt(partner.getRegisteredAt())
                .unregisteredAt(partner.getUnRegisteredAt())
                .categoryId(partner.getCategory().getId())
                .build();

        return Header.OK(body);

    }
}
