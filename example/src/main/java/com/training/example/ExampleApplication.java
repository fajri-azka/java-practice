package com.training.example;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ExampleApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ExampleApplication.class);

	public static void main(String[] args) {
		MDC.put("KEY", "Test Put MDC");
		LOGGER.info("This is Log Info");
		SpringApplication.run(ExampleApplication.class, args);
	}
}
