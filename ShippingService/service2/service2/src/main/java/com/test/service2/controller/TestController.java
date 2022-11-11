package com.test.service2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping
	public String sayHello() {
		return "heeeelooooooo 2";
	}
}
