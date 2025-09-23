package com.example.study2.exception;


import lombok.extern.slf4j.Slf4j;

/**
 * author : smseo
 * date : 2025-09-29
 * description :
 * ============================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-09-29 smseo 최초 생성
 */
@Slf4j
public class PersonNotFoundException extends RuntimeException{
    private static final String MESSAGE = "Person Entity가 존재하지 않습니다.";

    public PersonNotFoundException(){
        super(MESSAGE);
        log.info(MESSAGE);

    }
}
