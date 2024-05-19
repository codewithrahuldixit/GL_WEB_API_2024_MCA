package com.rahul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private CurrencyExchangeRepository repository;
	
	public CurrencyExchangeController(CurrencyExchangeRepository repository) {
		super();
		this.repository = repository;
		repository.save(new CurrencyExchange(101,"USD","INR",95));
		repository.save(new CurrencyExchange(102,"EUR","INR",150));
		repository.save(new CurrencyExchange(103,"DINAR","INR",200));
		repository.save(new CurrencyExchange(104,"INR","NEPALI",2));
		repository.save(new CurrencyExchange(105,"USD","NEPALI",160));
		
	}

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		
		return repository.findByFromAndTo(from, to);
	}

}
