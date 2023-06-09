package com.softech.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeader {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int OrdId;
	private String userName;
	private String userMobileNo;
	private String purchaseOrdNo;
	private LocalDate purchaseOrdDate;
	
	@OneToOne(cascade = CascadeType.ALL)
    private orderItems orderitems;
    
	@OneToOne(cascade = CascadeType.ALL)
    private address address;
    
}