package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HBelloFromRest {
	
	@GetMapping("/api/{name}")
	public String greet(@PathVariable String name) {
		return "Hello..." +name + "..!" ;
	}
	

}
