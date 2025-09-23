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
public class RenameNotPermittedException extends RuntimeException{
    private static final String MESSAGE = "이름을 변경 허용하지 않습니다.";

    public RenameNotPermittedException(){
        super(MESSAGE);
        log.info(MESSAGE);
    }
}
