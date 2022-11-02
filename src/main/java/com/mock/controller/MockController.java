package com.mock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/mock")
    public String mockTest(@RequestParam String name) {
        return name + " 테스트 중입니다.";
    }
}
