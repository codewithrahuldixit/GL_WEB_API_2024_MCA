package com.rahul;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy proxy;

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable long quantity) {
		
		HashMap<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);
		CurrencyConversion currencyConversion = responseEntity.getBody();
		long totalamount = quantity * currencyConversion.getConversionMultiple();
		currencyConversion.setTotalCalculatedAmount(totalamount);
		currencyConversion.setQuantity(quantity);
		currencyConversion.setEnvirnoment(currencyConversion.getEnvirnoment()+" Rest Template");
		return currencyConversion;
		//return new CurrencyConversion(currencyConversion.getId(), from, to, q,
			//	currencyConversion.getConversionMultiple(), totalamount);
	}

	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversionfeign(@PathVariable String from, @PathVariable String to,
			@PathVariable long quantity) {
		CurrencyConversion currencyConversion = proxy.retrieveExchangeValue(from, to);
		long totalamount = quantity * currencyConversion.getConversionMultiple();
		currencyConversion.setTotalCalculatedAmount(totalamount);
		currencyConversion.setQuantity(quantity);
		currencyConversion.setEnvirnoment(currencyConversion.getEnvirnoment()+" Feign Client");
		return currencyConversion;
	
	}
}
