package com.softech.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.orderItems;
@Repository
public interface orderItemsRepository extends JpaRepository<orderItems, Serializable> {

	
	
}
