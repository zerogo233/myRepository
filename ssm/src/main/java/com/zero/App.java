package com.zero;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zero.mapper") //@MapperScan 用户扫描MyBatis的Mapper接口
public class App {

	// sdf
	public static void main(String[] args) {
		SpringApplication
		.run(App.class, args);
	}
}
