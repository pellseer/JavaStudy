package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends StudyApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderdetail = new OrderDetail();

        orderdetail.setOrderAt(LocalDateTime.now());
        //orderdetail.setUserId(1L);
        //orderdetail.setItemId(1L);

        OrderDetail newOrderDetail = orderDetailRepository.save(orderdetail);
    }
}
