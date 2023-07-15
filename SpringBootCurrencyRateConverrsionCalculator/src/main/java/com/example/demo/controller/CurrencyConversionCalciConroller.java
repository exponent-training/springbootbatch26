package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CurrencyConversion;

@RestController
public class CurrencyConversionCalciConroller {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping(value = "/currencychange/{fromCurrency}/to/{toCurrency}/quantity/{quantity}")
	public ResponseEntity<CurrencyConversion> getCalculatedCurrencyRate(@PathVariable String fromCurrency,
			@PathVariable String toCurrency,@PathVariable BigDecimal quantity){
		System.out.println("Currency Change :" + fromCurrency + "  to : " + toCurrency + " quantity : " + quantity);
	
		Map<String, String> uriVariables = new HashMap<String, String>(); 
		uriVariables.put("fromCurrency", fromCurrency);
		uriVariables.put("toCurrency", toCurrency);
		ResponseEntity<CurrencyConversion> responseEntity =  restTemplate.getForEntity("http://localhost:8005/currencyrate/{fromCurrency}/to/{toCurrency}", CurrencyConversion.class,uriVariables);
	    CurrencyConversion currencyConversion =  responseEntity.getBody();
	    currencyConversion.setQuantity(quantity);
	    BigDecimal totalAmount = quantity.multiply(currencyConversion.getConversionRate());
	    currencyConversion.setTotalAmount(totalAmount);
		return ResponseEntity.ok(currencyConversion);
	}
	
}
