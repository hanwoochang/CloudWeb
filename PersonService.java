package com.example.springmvcdemo;

import java.util.List;

public interface PersonService {
    int count();
    Person getPersonById(long id);
    List<Person> getPeople();
}
