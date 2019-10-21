package com.persistent.analysisservice.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "search-service", url = "192.168.56.111:7001")
@FeignClient(name = "search-service")
@RibbonClient(name="search-service")
public interface MasterVariantCreatorProxy {

	@GetMapping("/createMV/{chrome}")
  	public String getMV(@PathVariable("chrome") String chrome);

}
