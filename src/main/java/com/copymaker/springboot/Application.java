package com.copymaker.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 이 선언된 클래스의 위치부터 설정을 읽어 간다
 * 프로젝트의 최상단에 위치해야 한다
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
