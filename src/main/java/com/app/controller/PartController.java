package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Part;
import com.app.service.IPartService;

@Controller
@RequestMapping("/part")
public class PartController {
	
	@Autowired
	private IPartService service;
	
	@GetMapping("/register")
	public String show() {
		return "PartRegisterPage";
	}
@PostMapping("/save")	
public String reg(@ModelAttribute Part partType,Model model) {
	Integer id=service.savePart(partType);
	String msg="part '"+id+"' successfully saved";
	model.addAttribute("msg", msg);
	return "PartRegisterPage";
}
@GetMapping("/all")
public String giv(Model model) {
	List<Part> list=service.getAllParts();
	model.addAttribute("list", list);
	return"PartDataPage";
}

@GetMapping("/delete/{id}")
public String del(@PathVariable Integer id,Model model) {
	String msg=null;
	if(service.isPartExist(id)) {
		service.deletePart(id);
		msg="Part '"+id+"' delete succesfully";
	}else
		msg="Part '"+id+"' not exist";
	model.addAttribute("msg", msg);
	List<Part> list=service.getAllParts();
	model.addAttribute("list", list);
	return"PartDataPage";
	
	
	
	
	
}
	
}
