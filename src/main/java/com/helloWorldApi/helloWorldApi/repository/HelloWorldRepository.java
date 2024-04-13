package com.helloWorldApi.helloWorldApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helloWorldApi.helloWorldApi.Entities.HelloWorldEntity;

public interface HelloWorldRepository extends JpaRepository<HelloWorldEntity, Integer>{
}
