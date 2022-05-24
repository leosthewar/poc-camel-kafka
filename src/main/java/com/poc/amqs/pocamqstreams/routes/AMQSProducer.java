package com.poc.amqs.pocamqstreams.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.poc.amqs.pocamqstreams.routes.bean.UuidGenerator;

@Component
public class AMQSProducer extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("timer://foo?period=5000").id("producer")
		.to("velocity:templates/message.json?contentCache=true")
		//.bean(UuidGenerator.class)
		.to("kafka:poc")
		.log(LoggingLevel.INFO, "Message send to Kafka ${body}")
		.end();
		
		
	}

}
