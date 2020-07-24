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

import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;

@Controller
@RequestMapping("/shipmenttype")
public class ShipmentTypeController {

	@Autowired
	private IShipmentTypeService service;

	@GetMapping("/register")
	public String showreg() {
		return "ShipmentTypeRegister";
	}

	@PostMapping("/save")
	public String sav(@ModelAttribute ShipmentType shipmenttype, Model model) {
		Integer id=service.saveShipmentType(shipmenttype);
		String message="ShipmentType '"+id+"' saved successfully";
		model.addAttribute("message", message);
		return "ShipmentTypeRegister";


	}

	@GetMapping("/all")
	public String givedat(Model model ) {
		List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
	}

	@GetMapping("/delete/{id}")
	public String del(@PathVariable Integer id,Model model) {
		String msg=null;
		if(service.isShipmentTypeExist(id)) {
			service.deleteShipmentType(id);
			msg="ShipmentType '"+id+"' deleted succesfully";
		}
		else {
			msg="ShipmentType '"+id+"' not deleted succesfully";
		}
		model.addAttribute("msg", msg);
		List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
	}
}
