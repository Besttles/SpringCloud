package com.forezp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//添加注解，开启Eureka服务注册中心，同时自己的服务也会被发现并注册
@EnableEurekaServer
//@EnableAutoConfiguration
public class ServerOfferApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerOfferApplication.class, args);
	}

}
