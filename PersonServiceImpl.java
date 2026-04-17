package com.example.springmvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO dao;

    public int count() {
        return dao.count();
    }

    @Override
    public Person getPersonById(long id) {
        return dao.getPersonById(id);
    }

    @Override
    public List<Person> getPeople() {
        return dao.getPeople();
    }
}
