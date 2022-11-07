package com.sugarglider.apachecamelpracticea.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class MyFirstTimerRouter extends RouteBuilder {
	
	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;
	@Autowired
	private SimpleLogProcessingComponent simpleLogProcessingComponent;
	

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:first-timer").bean(getCurrentTimeBean).bean(simpleLogProcessingComponent).process(new SimpleLoggingProcessor()).to("log:first-timer");
	}

}
