package com.sermo.components;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sermo.components.dao")
@SpringBootApplication
public class WebsocketBizApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketBizApplication.class, args);
	}
}
