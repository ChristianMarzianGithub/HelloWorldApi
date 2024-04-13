package com.helloWorldApi.helloWorldApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloWorldApi.helloWorldApi.Entities.HelloWorldEntity;
import com.helloWorldApi.helloWorldApi.repository.HelloWorldRepository;

@Service
public class HelloWorldService {

	@Autowired
	HelloWorldRepository helloWorldRepository;
	
	public List<HelloWorldEntity> getAll(){
		return helloWorldRepository.findAll();
	}
}