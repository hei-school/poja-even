package com.example.demo;

public class Test {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
