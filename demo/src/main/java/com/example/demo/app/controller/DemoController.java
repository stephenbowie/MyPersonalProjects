package com.example.demo.app.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.model.DemoModel;
import com.example.demo.app.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/hello")
	public List<DemoModel> helloWorld() {
		return demoService.getDemos();
	}

	@RequestMapping("/hello/{id}")
	public Optional<DemoModel> getDemoById(@PathVariable String id) {
		return demoService.getSpecificDemo(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/hello")
	public void addDemo(@RequestBody DemoModel demoModel) {
		demoService.addDemo(demoModel);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/hello/{id}")
	public void updatedDemo(@PathVariable String id, @RequestBody DemoModel demoModel) {
		demoService.updateDemo(id, demoModel);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value= "/hello/{id}")
	public void deleteDemo (@PathVariable String id) {
		demoService.removeDemo(id);
	}

}
