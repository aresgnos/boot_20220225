package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // value 중복되면 안된다.

    // 127.0.0.1:8080/home
    @GetMapping(value = "/home")
    public String homeGET() {
        // home.jsp로 list값을 전송시켜서 출력
        return "home";
    }

    // 127.0.0.1:8080/join
    @GetMapping(value = "/join")
    public String joinGET() {
        // join.jsp를 표시
        return "join";
    }

    // 127.0.0.1:8080/login
    @GetMapping(value = "/login")
    public String loginGET() {
        return "login";
    }

    // 127.0.0.1:8080/login
    @GetMapping(value = "/board")
    public String boardGET() {
        return "board";
    }

}
