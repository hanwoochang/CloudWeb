package com.example.springmvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonMemoryDAOImple implements PersonDAO {

    private List<Person> database;

    public PersonMemoryDAOImple() {
        database = new ArrayList<>();
        database.add(new Person(1, "이순신222", 56));
        database.add(new Person(2, "임꺽정222", 45));
        database.add(new Person(3, "홍길동222", 78));
        database.add(new Person(4, "신사임당222", 78));
    }

    @Override
    public int count() {
        return database.size();
    }

    @Override
    public Person getPersonById(long id) {
        return  database.stream().filter(person -> person.getId() == id).findFirst().get();
    }
    @Override
    public List<Person> getPeople() {
        return database;
    }
}
