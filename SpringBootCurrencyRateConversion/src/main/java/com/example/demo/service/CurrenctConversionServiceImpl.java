package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CurrencyConversion;

@Service
public class CurrenctConversionServiceImpl implements CurrencyConversionService{

	@Override
	public CurrencyConversion getCurrencyConversion(String fromCurrency, String toCurrency) {
		// TODO Auto-generated method stub
		CurrencyConversion currencyConversion1 =  null;
		List<CurrencyConversion> list = new ArrayList<CurrencyConversion>();
		
		CurrencyConversion currencyConversion = new CurrencyConversion();
		currencyConversion.setId(1);
		currencyConversion.setFromCurrency("USD");
		currencyConversion.setToCurrency("INR");
		currencyConversion.setConversionRate(BigDecimal.valueOf(82));
		
		list.add(currencyConversion);
		
		for(CurrencyConversion c : list) {
			if(c.getFromCurrency().equals(fromCurrency) && c.getToCurrency().equals(toCurrency))
			{
				currencyConversion1 = c;
				break;
			}
		}
		
		return currencyConversion1;
	}

}
