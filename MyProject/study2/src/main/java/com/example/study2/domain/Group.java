package com.example.study2.domain;

import com.example.study2.controller.dto.GroupDto;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.swing.*;
import java.util.List;

/**
 * author : smseo
 * date : 2025-09-30
 * description :
 * ============================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-09-30 smseo 최초 생성
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToMany
    @JoinColumn(name = "group_id")
    private List<Person> personList;
}
