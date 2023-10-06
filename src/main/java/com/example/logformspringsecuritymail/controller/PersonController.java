package com.example.logformspringsecuritymail.controller;

import com.example.logformspringsecuritymail.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
@RequestMapping("/")
@Scope("prototype")
public class PersonController {

    @Autowired
    private PersonService personService;
}
