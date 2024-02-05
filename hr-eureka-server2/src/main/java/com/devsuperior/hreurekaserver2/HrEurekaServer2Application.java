package com.devsuperior.hreurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(HrEurekaServer2Application.class, args);
	}

}
