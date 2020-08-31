package com.cg.omms.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineMovieMgmtEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieMgmtEurekaServerApplication.class, args);
	}

}
