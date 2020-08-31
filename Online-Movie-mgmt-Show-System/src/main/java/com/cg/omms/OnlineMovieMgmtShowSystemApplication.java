package com.cg.omms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlineMovieMgmtShowSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieMgmtShowSystemApplication.class, args);
	}

}
