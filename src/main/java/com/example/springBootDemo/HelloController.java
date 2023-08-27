package com.example.springBootDemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("hello")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Map<String, String> getUser(){  
        Map<String, String> sample = new HashMap<String, String>();
        sample.put("Key", "value");
        return sample;
    }

	@GetMapping("")
	public String index() {
		return "Greetings from Sandeep's Spring Boot Application!";
	}

}