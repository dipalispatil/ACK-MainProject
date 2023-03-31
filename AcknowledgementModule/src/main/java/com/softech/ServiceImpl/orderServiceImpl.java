package com.softech.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softech.Entity.OrderHeader;
import com.softech.Repository.OrderHeaderRepository;
import com.softech.Service.OrderService;

@Service
public class orderServiceImpl implements OrderService {
	
    @Autowired
	private OrderHeaderRepository OrderHeaderRepo;
	
	@Override
	public OrderHeader addorder(OrderHeader Order) {
		OrderHeader orderHeader = OrderHeaderRepo.save(Order);
		return orderHeader;
	}

	@Override
	public List<OrderHeader> GetAllOrder() {
		List<OrderHeader>all = OrderHeaderRepo.findAll();
		return all;
	}

	@Override
	public boolean deleteorder(Integer ordId) {
		OrderHeaderRepo.deleteById(ordId);	
		return false;
	}

	@Override
	public OrderHeader updateOrder(OrderHeader orderHeader) {
		OrderHeader update = OrderHeaderRepo.save(orderHeader);
		return update;
	}

	

	
	
	
}
