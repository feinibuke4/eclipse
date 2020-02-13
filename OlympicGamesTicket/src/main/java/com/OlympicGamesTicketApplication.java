package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.dao")
//@ComponentScan(basePackages = {"com.dao","com.web.controller"})
public class OlympicGamesTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlympicGamesTicketApplication.class, args);
	}

}
