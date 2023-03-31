package com.softech.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softech.Entity.OrderHeader;
import com.softech.Service.OrderService;

@RestController
public class ServiceController {
	@Autowired
	public OrderService orderSer;
	
	@PostMapping("/Saveorder")
	public OrderHeader saveorder(@RequestBody OrderHeader ohHeader) {
		OrderHeader addorder = orderSer.addorder(ohHeader);
		
		return addorder;
	}
	@GetMapping("/getOrder")
	public List<OrderHeader> getAll(){
		List<OrderHeader> getAllOrder = orderSer.GetAllOrder();
		return getAllOrder;
	}
	
	@DeleteMapping("/delete/{ordId}")
	public String DeleteByid(@PathVariable Integer ordId ) {
		orderSer.deleteorder(ordId);
		String s = "Data deleted Successfully";
		return s;
		
	}
	@PutMapping("/update/{sid}")
	public OrderHeader updateOrder(@RequestBody OrderHeader orderHeader) {
		OrderHeader updateOrder =orderSer.updateOrder(orderHeader);
		return updateOrder;
		
	}
	
}
