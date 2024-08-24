package com.sugarglider.apachecamelpracticeb.processor;

import com.sugarglider.apachecamelpracticeb.beans.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PersonProcessor {

    Logger logger = LoggerFactory.getLogger(PersonProcessor.class);

    public void process(Person person) {
        logger.info("Processing person: {}" , person);
    }

}
