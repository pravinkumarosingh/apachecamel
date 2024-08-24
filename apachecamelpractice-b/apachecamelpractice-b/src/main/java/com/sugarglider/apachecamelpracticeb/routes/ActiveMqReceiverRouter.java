package com.sugarglider.apachecamelpracticeb.routes;

import com.sugarglider.apachecamelpracticeb.beans.Person;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		//from("activemq:my-active-mq").to("log:recevied message from activemq");

		from("activemq:my-active-mq").unmarshal().json(JsonLibrary.Jackson, Person.class).to("log:recevied message from activemq");
	}
	
}
