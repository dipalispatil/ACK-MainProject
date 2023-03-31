package com.softech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softech.Entity.orderHeader;
import com.softech.Service.orderService;


@RestController
public class mainController {
    @Autowired
	private orderService orderser;
	
    @PostMapping("/order")
	public ResponseEntity<orderHeader> saveorder(@RequestBody orderHeader order){
		
		try {
			orderHeader addOrder = orderser.addOrder(order);
			return new ResponseEntity<>(addOrder,HttpStatus.CREATED);
			
		}catch(Exception e) {
			e.printStackTrace();
			
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
	}
	

}
