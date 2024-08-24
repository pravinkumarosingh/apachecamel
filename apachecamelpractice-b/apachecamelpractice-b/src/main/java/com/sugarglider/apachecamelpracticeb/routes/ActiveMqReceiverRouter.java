package com.sugarglider.apachecamelpracticeb.routes;

import com.sugarglider.apachecamelpracticeb.beans.Person;
import com.sugarglider.apachecamelpracticeb.processor.PersonProcessor;
import com.sugarglider.apachecamelpracticeb.transformer.PersonTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {

	@Autowired
	private PersonProcessor personProcessor;

	@Autowired
	private PersonTransformer personTransformer;

	public ActiveMqReceiverRouter(PersonProcessor personProcessor) {
		this.personProcessor = personProcessor;
	}

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		//from("activemq:my-active-mq").to("log:recevied message from activemq");

		from("activemq:my-active-mq")
				.unmarshal().json(JsonLibrary.Jackson, Person.class)
				.bean(personProcessor)
				.bean(personTransformer)
				.to("log:recevied message from activemq");
	}
	
}
