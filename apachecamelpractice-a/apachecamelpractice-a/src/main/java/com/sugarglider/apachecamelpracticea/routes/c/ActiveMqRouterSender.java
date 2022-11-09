package com.sugarglider.apachecamelpracticea.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqRouterSender extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:activemq-timer?period=10000").transform().constant("my message for activemq").to("activemq:my-active-mq");
	}
	

}
