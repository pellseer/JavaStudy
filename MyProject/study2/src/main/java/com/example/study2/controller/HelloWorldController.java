package com.example.study2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : smseo
 * date : 2025-09-16
 * description :
 * ============================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-09-16 smseo 최초 생성
 */
@RestController
public class HelloWorldController {

    @PostMapping("/api/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }
}
