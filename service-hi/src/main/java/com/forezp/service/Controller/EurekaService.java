package com.forezp.service.Controller;import org.springframework.cloud.netflix.eureka.EnableEurekaClient;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;@RestController@EnableEurekaClientpublic class EurekaService {    @RequestMapping("/hello")    public String hello(){        return "hello ,i am Eureka service!";    }}