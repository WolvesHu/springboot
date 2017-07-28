package com.wolves.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ExampleController {
	protected static Logger logger=LoggerFactory.getLogger(ExampleController.class); 
	@RequestMapping("/")
	public String home() {
		logger.info("111111111111");
		logger.debug("2222222222222222222");
		logger.error("33333333333333333333333333");
		logger.warn("444444444444444444444444444444444444");
		return "hello world";
	}
}
