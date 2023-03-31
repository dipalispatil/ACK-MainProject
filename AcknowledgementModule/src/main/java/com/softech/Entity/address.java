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
public class address {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addId;
	private String addressName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;

	
	
}