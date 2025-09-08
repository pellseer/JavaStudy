package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        String account = "Test01";
        String password = "Test01";
        String status = "REGISTERED";
        String email = "Test01@gmail.com";
        String phoneNumber = "010-1111-2222";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";

        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setStatus(status);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setCreatedAt(registeredAt);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(createdBy);

        User newUser = userRepository.save(user);
        Assert.notNull(newUser,"newUser be null");
    }

    @Test
    @Transactional
    public void read(){

        User user = userRepository.findFirstByPhoneNumberOrderByIdDesc("010-1111-0011");

        user.getOrderGroupList().stream().forEach(orderGroup -> {
            System.out.println("------------------주문묶음------------------");
            System.out.println("수령인: " + orderGroup.getRevName());
            System.out.println("수령지: " + orderGroup.getRevAddress());
            System.out.println("------------------주문상세------------------");

            orderGroup.getOrderDetailList().forEach(orderDetail -> {
                System.out.println("파트너사 이름: " + orderDetail.getItem().getPartner().getName());
                System.out.println("파트너사 카테고리: " + orderDetail.getItem().getPartner().getCategory().getTitle());
                System.out.println("주문 상품: " + orderDetail.getItem().getName());
                System.out.println("고객센터 번호: " + orderDetail.getItem().getPartner().getCallCenter());
                System.out.println("주문의 상태: " + orderDetail.getStatus());
                System.out.println("도착예정일: " + orderDetail.getArrivalDate());
            });
        });
        Assert.notNull(user,"user be null");

    }

    @Test
    public void update(){

    }

    @Test
    public void delete(){
        Optional<User> user = userRepository.findById(2L);
        user.ifPresent(selectUser ->{
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(2L);
        if(deleteUser.isPresent()){
            System.out.println("데이터 존재 : " + deleteUser.get());
        }
        else{
            System.out.println("데이터 삭제 데이터 없음");
        }
    }
}
