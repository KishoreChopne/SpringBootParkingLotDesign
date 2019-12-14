package com.spring.boot.learning.lombok.hellocontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorldApplication")
public class HelloController {
	
	@GetMapping("/hello")
	public String getHello(){
		return "Hello Parking Lot";
	}

}
