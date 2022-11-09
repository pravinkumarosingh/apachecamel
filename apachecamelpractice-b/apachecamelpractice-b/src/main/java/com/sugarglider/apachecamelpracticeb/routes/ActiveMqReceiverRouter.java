package com.sugarglider.apachecamelpracticeb.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("activemq:my-active-mq").to("log:recevied message from activemq");
	}
	
}
