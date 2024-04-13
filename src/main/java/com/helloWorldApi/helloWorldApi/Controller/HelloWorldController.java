package com.helloWorldApi.helloWorldApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloWorldApi.helloWorldApi.Entities.HelloWorldEntity;
import com.helloWorldApi.helloWorldApi.service.HelloWorldService;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping("/helloWorld")
	public List<HelloWorldEntity> getHelloWorld() {
		return helloWorldService.getAll();
	}
}