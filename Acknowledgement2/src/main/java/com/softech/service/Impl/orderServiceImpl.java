package com.softech.service.Impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.softech.Entity.AdDocuments;
import com.softech.Entity.ProductInfo;
import com.softech.Entity.RdDocuments;
import com.softech.Entity.orderHeader;
import com.softech.Service.orderService;

public class orderServiceImpl implements orderService {

	RestTemplate restTemp = new RestTemplate();
	
	@Autowired
	private Environment env;
	
	
	@Override
	public orderHeader addOrder(orderHeader order) {
		String bsRoot = env.getProperty("api.bs.root");
		
		String url = bsRoot+"save/";
		
        HttpHeaders httpHeaders = new HttpHeaders();
        
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<orderHeader> httpEntity = new HttpEntity<>(order,httpHeaders);
		
		ResponseEntity<orderHeader> response = restTemp.exchange(url, HttpMethod.POST, httpEntity, orderHeader.class);
		
		return response.getBody();

		
	}


	@Override
	public ProductInfo addProduct(ProductInfo product) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public AdDocuments AdDocumentsGenerateAndPersist(orderHeader order) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RdDocuments RdDocumentsGenerateAndPersist(orderHeader order) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
