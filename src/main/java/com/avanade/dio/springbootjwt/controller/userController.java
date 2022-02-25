package com.avanade.dio.springbootjwt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.dio.springbootjwt.data.UserData;
import com.avanade.dio.springbootjwt.service.UserDetailsServiceImpl;

@RestController
public class userController {
	
	private final UserDetailsServiceImpl userDetailsService;
	
	public userController(UserDetailsServiceImpl userDetailsService){
		this.userDetailsService = userDetailsService;
	}
	
	@RequestMapping("/all-users")
	public List<UserData> listAllUsers(){
		return userDetailsService.ListUsers();
		
	}

}
