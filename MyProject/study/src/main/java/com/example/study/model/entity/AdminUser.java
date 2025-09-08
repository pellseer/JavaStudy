package com.example.study.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String account;
    private String password;
    private String status;
    private String role;
    private LocalDateTime lastLoginAt;
    private LocalDateTime passwordUpdatedAt;
    private int loginFailCount;
    private LocalDateTime registeredAt;
    @Column(name="unregistered_at")
    private LocalDateTime unRegisteredAt;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
