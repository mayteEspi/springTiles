package com.meh.springtiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {


	@GetMapping("/")
	public ModelAndView home(){
		ModelAndView modelView = new ModelAndView("welcomeMeh");
	    return modelView;
	}
}
