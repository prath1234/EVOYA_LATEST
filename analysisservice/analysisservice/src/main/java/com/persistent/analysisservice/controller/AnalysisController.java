package com.persistent.analysisservice.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.persistent.analysisservice.config.Configuration;
import com.persistent.analysisservice.dto.QueueConfiguration;
@EnableDiscoveryClient
@RestController
public class AnalysisController {

	@Autowired
	private Configuration configuration;
	
	@Autowired
	private DiscoveryClient client;

	@Autowired
	private RestTemplate restTemplate;

	
	@Autowired
	MasterVariantCreatorProxy masterVariantCreatorProxy;

	@GetMapping("/queue-params")
	public QueueConfiguration getQueueParameters() {
		System.out.println("Test");
		return new QueueConfiguration(String.valueOf(configuration.getQueuelength()));
	}

	@GetMapping("/createMVFromAnalysis/{chrome}")
	public String createMV(@PathVariable String chrome) {

		return masterVariantCreatorProxy.getMV(chrome);

	}
	
	@GetMapping("/createMVFromAnalysiswithConsul/{chrome}")
	public String createMVWithConsul(@PathVariable String chrome) {
		URI uri =  client.getInstances("search-service").stream().map(
				si -> si.getUri()).findFirst().map(s -> s.resolve("/createMV/"+ chrome)).get();
		return restTemplate.getForObject(uri, String.class);

	}
	
	//@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	
	
}
