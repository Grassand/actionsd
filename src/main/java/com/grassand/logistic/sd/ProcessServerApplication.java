package com.grassand.logistic.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaServer
@SpringBootApplication
public class ProcessServerApplication {

	/**
	 * Main Method
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProcessServerApplication.class, args);
	}

}
