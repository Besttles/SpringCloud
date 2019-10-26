package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by biwh on 2019/10/26.
 */
@SpringBootApplication
@EnableConfigServer
public class EurekaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigApplication.class, args);
    }

}
