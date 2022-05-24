package com.poc.amqs.pocamqstreams.routes;

import java.util.UUID;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AMQSConsumer extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		
		from("kafka:poc?groupId=poc-group&clientId="+UUID.randomUUID().toString()).id("consumer")
        .log("Message received from Kafka : ${body}  on the topic ${headers[kafka.TOPIC]}")
        .log("offset : ${headers[kafka.OFFSET]} - particion: ${headers[kafka.PARTITION]}")
		.end();
		
	}

}
