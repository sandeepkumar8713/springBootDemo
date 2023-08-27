package com.example.springBootDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumingRestController{

    private static final Logger log = LoggerFactory.getLogger(ConsumingRestController.class);
    
    @GetMapping("/consumeRest")
	public QuotesEntity consume() {
        String uri = "https://dummyjson.com/quotes";
        RestTemplate restTemplate = new RestTemplate();
        QuotesEntity quotes = restTemplate.getForObject(uri, QuotesEntity.class);
        if (quotes != null){
            log.info(quotes.toString());
        } else{
            log.info("quotes is empty");
        }
		return quotes;
	}
}
