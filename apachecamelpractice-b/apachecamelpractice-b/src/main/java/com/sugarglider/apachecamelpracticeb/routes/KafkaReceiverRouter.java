package com.sugarglider.apachecamelpracticeb.routes;

import com.sugarglider.apachecamelpracticeb.beans.Person;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class KafkaReceiverRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("kafka:myKafkaTopic")
                .to("log:recevied message from kafka");
    }
}
