package com.example.study.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Integer price;
    private String content;

    // 1:N
    @OneToMany(fetch =FetchType.EAGER, mappedBy = "item")
    private List<OrderDetail> orderDetailList;
}
