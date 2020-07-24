package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.ICounterService;

@Controller
@RequestMapping("/counter")
public class CounterController {

	@Autowired
	private ICounterService service;

	@GetMapping("/register")
	public String sav() {
		return "CounterPage";


	}

}
