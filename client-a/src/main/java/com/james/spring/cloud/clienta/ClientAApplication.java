package com.james.spring.cloud.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientAApplication.class, args);
	}
}
