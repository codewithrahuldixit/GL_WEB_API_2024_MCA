package com.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment enviornment;
	private CurrencyExchangeRepository repository;	
	public CurrencyExchangeController(CurrencyExchangeRepository repository) {
		super();
		this.repository = repository;
		repository.save(new CurrencyExchange(101,"USD","INR",95,"NA"));
		repository.save(new CurrencyExchange(102,"EUR","INR",150,"NA"));
		repository.save(new CurrencyExchange(103,"DINAR","INR",200,"NA"));
		repository.save(new CurrencyExchange(104,"INR","NEPALI",2,"NA"));
		repository.save(new CurrencyExchange(105,"USD","NEPALI",160,"NA"));
	}
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {		
		CurrencyExchange curr = repository.findByFromAndTo(from, to);
		curr.setEnvirnoment(enviornment.getProperty("local.server.port"));
		return curr;
	}

}
