package com.persistent.searchservice;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class Configuration {

	private int searchlimit;
	
	private String port;
	
	private String searchName;

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public int getSearchlimit() {
		return searchlimit;
	}

	public void setSearchlimit(int searchlimit) {
		this.searchlimit = searchlimit;
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	

	
}
