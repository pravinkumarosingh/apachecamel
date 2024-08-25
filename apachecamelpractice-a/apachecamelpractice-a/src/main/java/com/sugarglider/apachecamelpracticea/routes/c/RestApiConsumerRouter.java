package com.sugarglider.apachecamelpracticea.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class RestApiConsumerRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        restConfiguration().host("localhost").port(8081);

        from("timer:api-timer?period=10000")
                .log("${body}")
                .to("rest:get:person")
                .log("${body}");
    }
}
