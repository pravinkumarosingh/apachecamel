package com.sugarglider.apachecamelpracticea.routes.b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFileRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		//from("file:files/input").log("${body}").to("file:files/output");

		from("file:files/input")
				.log("${body}")
				.routeId("File Input Route")
				.transform().body(String.class)
				.choice()
				.when(simple("${file:ext} ends with 'xml'"))
					.log("XML FILE")
				.when(simple("${body} contains 'John'"))
					.log("Not an xml file but contains John")
				.otherwise()
					.log("Not a xml file")
				.end()
				.log("${messageHistory} ${headers.CamelFileLastModified}")
				.to("file:files/output");
	}

}
