package com.poc.amqs.pocamqstreams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource
public class PocAmqStreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocAmqStreamsApplication.class, args);
	}

}
