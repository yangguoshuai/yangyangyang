package com.autoai.nglp.publicsurverysystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableTransactionManagement
@MapperScan(basePackages = {"com.autoai.nglp.publicsurverysystem.mapper"})
@SpringBootApplication(scanBasePackages={"com.autoai.nglp.*"})
public class PublicsurverysystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicsurverysystemApplication.class, args);
	}

}
