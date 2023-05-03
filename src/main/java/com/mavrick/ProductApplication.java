package com.mavrick;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ProductApplication {
	static Logger logger = LoggerFactory.getLogger(ProductApplication.class);
	public static void main(String[] args) {
		logger.info("ProductApplication started ::");
		SpringApplication.run(ProductApplication.class, args);
	}
}
