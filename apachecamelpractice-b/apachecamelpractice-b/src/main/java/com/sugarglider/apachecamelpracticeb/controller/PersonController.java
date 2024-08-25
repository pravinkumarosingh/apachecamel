package com.sugarglider.apachecamelpracticeb.controller;


import com.sugarglider.apachecamelpracticeb.beans.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping(value = "person", method = RequestMethod.GET)
    public Person getPerson(){
        return new Person("Pravin", 27);
    }

}
