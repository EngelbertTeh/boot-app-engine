package com.example.bootappengine;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BootAppengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAppengineApplication.class, args);
	}
	
	
	@RestController
	public class MainController {
		@GetMapping("/")
		public String index(@RequestParam(required=false) String name) {
			return String.format("Hello %s", name != null? name : "guest");
		}
	}

}
