package com.yellowcong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringmvc {
	
	@RequestMapping(value="/index")
	public String hello(){
		System.out.println("nimei");
		return "hello";
	}
}
