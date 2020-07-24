package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.IMachineTypeService;

@Controller
@RequestMapping("/machine")
public class MachineTypeController {
	
	@Autowired
	private IMachineTypeService service;

	@GetMapping("/reg")
	public String show() {
		return "MachineTypePage";


}}
