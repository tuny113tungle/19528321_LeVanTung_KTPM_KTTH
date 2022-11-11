package com.test.service1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping
	public String sayHello() {
		return "ShipperId:'12td'\tname:'le van tung'\tkm:'12'";
	}
}
