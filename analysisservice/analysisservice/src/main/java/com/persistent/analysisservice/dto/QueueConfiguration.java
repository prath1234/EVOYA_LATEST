package com.persistent.analysisservice.dto;

public class QueueConfiguration {
	
  public QueueConfiguration(String i) {
		super();
		this.queueLength = i;
	}

private String queueLength;

public String getQueueLength() {
	return queueLength;
}

public void setQueueLength(String queueLength) {
	this.queueLength = queueLength;
}
  

}
