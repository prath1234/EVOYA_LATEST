package com.persistent.searchservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.searchservice.model.MasterVariant;
import com.persistent.searchservice.repository.MasterVariantRepository;

//@RefreshScope
@RestController
@SpringBootApplication
public class SearchserviceApplication {

	@Autowired
	private Configuration configuration;
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private MasterVariantRepository masterVariantRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SearchserviceApplication.class, args);
	}

	@GetMapping("/test")
	public String getTestString() {
		return "Search Limit is : " + configuration.getSearchlimit() + " on port " + environment.getProperty("local.server.port");
	}
	
	
	@GetMapping("/createMV/{chrome}")
	public String getMV(@PathVariable("chrome") String chrome) {
		MasterVariant  mv = new MasterVariant();
		mv.setChrom_start_stop_ref_alt(chrome);
		masterVariantRepository.save(mv);
		return mv.getChrom_start_stop_ref_alt() 
				+ String.valueOf(System.currentTimeMillis() 
				+ " on port " 
				+ environment.getProperty("local.server.port") 
				+ " with search limit " 
				+  configuration.getSearchlimit()
				+ " with search name " 
				+  configuration.getSearchName());
	}

}
