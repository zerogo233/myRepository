package com.zero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zero.pojo.User;
import com.zero.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService usersService;
	
	@RequestMapping("/show")
	public String showInfo(Model model){
		List<User> list = usersService.findUserAll();
		model.addAttribute("list", list);
		return "showUsers";
	}

}
