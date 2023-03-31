package com.softech.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class orderItems {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orditemId;
	private int productNo;
	private String productName;
	private String productQuantity;
	private String productPrice;
	
}