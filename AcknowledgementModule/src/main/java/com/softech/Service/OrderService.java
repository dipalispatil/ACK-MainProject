package com.softech.Service;



import java.util.List;

import com.softech.Entity.OrderHeader;
public interface OrderService {

	public OrderHeader addorder(OrderHeader Order);

	public List<OrderHeader> GetAllOrder();

	public boolean deleteorder(Integer ordId);

	public OrderHeader updateOrder(OrderHeader orderHeader);

}
