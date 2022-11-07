package com.sugarglider.apachecamelpracticea.routes.a;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SimpleLoggingProcessor implements Processor {
	
	Logger logger = LoggerFactory.getLogger(SimpleLogProcessingComponent.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		logger.info("SimpleLoggingProcessor {}",exchange.getMessage().getBody());
	}
	

}
