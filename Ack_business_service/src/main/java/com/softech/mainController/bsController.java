package com.softech.mainController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softech.Entity.orderHeader;
import com.softech.bsService.service;

@RestController
public class bsController {
	
	@Autowired
	private service service;
	
	@Autowired
	private Environment environment;
	
	@PostMapping("/save")
	public orderHeader home(@RequestBody orderHeader order){
		orderHeader saveOrder = service.saveOrder(order);
		
		return saveOrder;
		
	}

}
