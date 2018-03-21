package com.liumapp.archetype.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liumapp
 * @file Eureka.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class , args);
    }

}
