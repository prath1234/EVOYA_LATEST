package com.persistent.analysisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients("com.persistent.analysisservice")
@SpringBootApplication
@EnableDiscoveryClient
public class AnalysisserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalysisserviceApplication.class, args);
	}

}
