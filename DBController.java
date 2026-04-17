package com.example.springmvcdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DBController {

    @Autowired
    private PersonService service;

    @RequestMapping("/count")
    public String count() {
        return "현재 인원 " + service.count();
    }

    @RequestMapping("/person/{id}")
    @ResponseBody
    public Person person(@PathVariable("id") long id) {
        return  service.getPersonById(id);
    }

    @RequestMapping("/people")
    public List<Person> people() {
        return service.getPeople();
    }
}


