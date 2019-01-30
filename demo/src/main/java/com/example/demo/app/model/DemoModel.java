package com.example.demo.app.model;

public class DemoModel {

	private String demoId;
	private String demoTopic;
	private String demoDescription;

	public DemoModel() {

	}

	public DemoModel(String demoId, String demoTopic, String demoDescription) {
		super();
		this.demoId = demoId;
		this.demoTopic = demoTopic;
		this.demoDescription = demoDescription;
	}

	public String getDemoId() {
		return demoId;
	}

	public void setDemoId(String demoId) {
		this.demoId = demoId;
	}

	public String getDemoTopic() {
		return demoTopic;
	}

	public void setDemoTopic(String demoTopic) {
		this.demoTopic = demoTopic;
	}

	public String getDemoDescription() {
		return demoDescription;
	}

	public void setDemoDescription(String demoDescription) {
		this.demoDescription = demoDescription;
	}

}
