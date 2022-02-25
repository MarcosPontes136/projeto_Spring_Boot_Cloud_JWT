package com.avanade.dio.springbootjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
	
	@RequestMapping("/status")
	public String viewStratus() {
		return "online";
	}
	
}
