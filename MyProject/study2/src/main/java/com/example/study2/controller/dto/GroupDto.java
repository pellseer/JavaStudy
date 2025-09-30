package com.example.study2.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * author : smseo
 * date : 2025-09-30
 * description :
 * ============================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-09-30 smseo 최초 생성
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class GroupDto {
    private String description;
}
