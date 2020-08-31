package com.cg.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlineMovieMgmtLoginSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieMgmtLoginSystemApplication.class, args);
	}

}
