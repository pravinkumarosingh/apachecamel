package com.sugarglider.apachecamelpracticeb.transformer;

import com.sugarglider.apachecamelpracticeb.beans.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonTransformer {

    public void convertAge(Person person){
        person.setAge(person.getAge()+1);
    }

}
