package com.proconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HealthCheckServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCheckServiceApplication.class, args);
	}

}
//