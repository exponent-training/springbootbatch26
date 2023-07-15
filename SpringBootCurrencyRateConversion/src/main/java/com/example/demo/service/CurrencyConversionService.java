package com.example.demo.service;

import com.example.demo.entity.CurrencyConversion;

public interface CurrencyConversionService {

	CurrencyConversion getCurrencyConversion(String fromCurrency,String toCurrency);
}
