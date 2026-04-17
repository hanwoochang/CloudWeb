package com.example.springmvcdemo;

import java.util.List;

public interface PersonDAO {
    int count();
    Person getPersonById(long id);
    List<Person> getPeople();


}
