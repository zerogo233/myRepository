package com.zero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String view(){
		return "login";
	}
	
	@RequestMapping("/404")
	public String error(){
		return "404";
	}
}
