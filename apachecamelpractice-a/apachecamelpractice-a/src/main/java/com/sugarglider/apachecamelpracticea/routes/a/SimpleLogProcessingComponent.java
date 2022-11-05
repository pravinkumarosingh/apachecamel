package com.sugarglider.apachecamelpracticea.routes.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleLogProcessingComponent {
	
	Logger logger = LoggerFactory.getLogger(SimpleLogProcessingComponent.class);
	
	public void process(String message) {
		logger.info("Simple Log Processing Component {}",message);
	}

}
