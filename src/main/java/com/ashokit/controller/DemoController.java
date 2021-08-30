package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/demo")
public class DemoController {

	@GetMapping("/work")
	public String doWork(Model model) {
		model.addAttribute("text","Demo-Controller");
		return "display";
	}
	
	@GetMapping("/greet")
	public String displayGreetMsg(Model model) {
		model.addAttribute("msg","Good After Noon..!");
		return "index";
	}
}
