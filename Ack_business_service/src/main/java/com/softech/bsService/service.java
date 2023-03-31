package com.softech.bsService;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.softech.Entity.orderHeader;

@Service
public class service {

	private Environment env;
	
	RestTemplate restTemp = new RestTemplate();

	
	public orderHeader saveOrder(@RequestBody orderHeader order) {
		String coreRoot = env.getProperty("api.core.root");
		
		String url = coreRoot+"/saveOrder";
		
		HttpHeaders httpHeaders = new HttpHeaders();		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<orderHeader> httpEntity = new HttpEntity<>(order,httpHeaders);
		
		ResponseEntity<orderHeader> response = restTemp.exchange(url, HttpMethod.POST, httpEntity, orderHeader.class);
		
		return response.getBody();
		
	}
	
	
}
