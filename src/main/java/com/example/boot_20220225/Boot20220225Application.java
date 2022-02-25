package com.example.boot_20220225;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

// 내가 임의로 만든 controller의 위치를 설정 (명칭 자유롭게 가능)
@ComponentScan(basePackages = { "com.example.controller" })
public class Boot20220225Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot20220225Application.class, args);
		System.out.println("hello");
	}

}
