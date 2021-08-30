package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@GetMapping("/get-name")
	public String getUserData(Model model) {
		model.addAttribute("msg", "User Name::Raju");
		return "index";
	} 

}
