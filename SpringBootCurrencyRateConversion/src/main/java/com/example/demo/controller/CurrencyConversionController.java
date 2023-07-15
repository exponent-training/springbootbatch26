package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CurrencyConversion;
import com.example.demo.service.CurrencyConversionService;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyConversionService currencyConversionService;
	
	@GetMapping(value = "/currencyrate/{fromCurrency}/to/{toCurrency}")
	public ResponseEntity<CurrencyConversion> getCurrencyConversionRate(@PathVariable String fromCurrency,
			                                                            @PathVariable String toCurrency){
		System.out.println("Conversion Value : " + fromCurrency + " to : " + toCurrency);
		CurrencyConversion currencyConversion =  currencyConversionService.getCurrencyConversion(fromCurrency, toCurrency);
		return ResponseEntity.ok(currencyConversion);
	}
	
}
