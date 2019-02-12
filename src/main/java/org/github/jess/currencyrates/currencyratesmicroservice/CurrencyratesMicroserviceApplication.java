package org.github.jess.currencyrates.currencyratesmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrencyratesMicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CurrencyratesMicroserviceApplication.class, args);
		System.out.println("app loaded");
	}

}

