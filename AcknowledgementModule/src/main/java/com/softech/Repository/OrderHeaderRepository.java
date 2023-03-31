package com.softech.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.OrderHeader;

@Repository
public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Serializable>{

	
	
}
