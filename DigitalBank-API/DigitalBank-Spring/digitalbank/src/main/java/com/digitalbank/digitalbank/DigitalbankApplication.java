package com.digitalbank.digitalbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.digitalbank.digitalbank", "com.digitalbank"})


public class DigitalbankApplication {
	public static void main(String[] args) {
		SpringApplication.run(DigitalbankApplication.class, args);
	}

}
