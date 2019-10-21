package com.persistent.analysisservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class Configuration {

	private int queuelength;

	public int getQueuelength() {
		return queuelength;
	}

	public void setQueuelength(int queuelength) {
		this.queuelength = queuelength;
	}
	
	
	
}
