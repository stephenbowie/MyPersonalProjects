package com.example.demo.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.app.model.DemoModel;

@Service
public class DemoService {
	private List<DemoModel> demos = new ArrayList<>(Arrays.asList(new DemoModel("1", "Topic 1", "Description 1"),
			new DemoModel("2", "Topic 2", "Description 2"), new DemoModel("3", "Topic 3", "Description 3"),
			new DemoModel("4", "Topic 4", "Description 4")

	));

	public List<DemoModel> getDemos() {
		return demos;
	}

	public void setDemos(List<DemoModel> demos) {
		this.demos = demos;
	}

	public Optional<DemoModel> getSpecificDemo(String id) {
		return demos.stream().filter(t -> t.getDemoId().equals(id)).findFirst();
	}

	public void addDemo(DemoModel demoModel) {
		demos.add(demoModel);
	}

	public void updateDemo(String Id, DemoModel demoModel) {
		if (getSpecificDemo(Id).isPresent()) {
			for (int iterator = 0; iterator < demos.size(); iterator++) {
				DemoModel tempDemo = demos.get(iterator);
				if (tempDemo.getDemoId().equalsIgnoreCase(Id)) {
				tempDemo.setDemoDescription(demoModel.getDemoDescription());
				tempDemo.setDemoTopic(demoModel.getDemoTopic());
				}
			}
		}
	}
	
	public void removeDemo(String Id) {
		if (getSpecificDemo(Id).isPresent()) {
			for (int iterator = 0; iterator < demos.size(); iterator++) {
				DemoModel tempDemo = demos.get(iterator);
				if (tempDemo.getDemoId().equalsIgnoreCase(Id)) {
				demos.remove(iterator);
				}
			}
		}
	}

}
