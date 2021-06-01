package com.india.ecommerceRegisterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceRegisterserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceRegisterserverApplication.class, args);
	}

}
