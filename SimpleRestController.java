package com.example.springmvcdemo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SimpleRestController {

    List<Person> list = new ArrayList<Person>();


    public SimpleRestController() {
        list.add(new Person(1l, "이순신222", 56l));
        list.add(new Person(2l, "임꺽정222", 45l));
        list.add(new Person(3l, "홍길동222", 78l));
    }

    @GetMapping("/people/{id}")
    public Person findById(@PathVariable Long id) {

//        Person find = null;
//
//        for( int i =0 ; i < list.size(); i++) {
//            if (list.get(i).getId() == id ) find = list.get(i);
//        }
//
//        for(Person p : list) {
//            if (p.getId() == id ) find = p;
//        }
//        return find;

        return list.stream().
               filter(person -> person.getId() == id)
                      .findFirst()
                      .orElse(null);

    }

    @GetMapping("/people")
    public List<Person> findAll() {
        return list;
    }

    @PostMapping("/people")
    public Person save(@RequestBody Person person) {
        person.setId(list.getLast().getId() + 1);
        System.out.println(person);
        list.add(person);
        return  person;
    }


    @PutMapping("/people/{id}")
    public Person updateById(@PathVariable Long id, @RequestBody Person person) {

        Person find = list.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        //find.setId(  person.getId() );
        find.setName(person.getName());
        find.setAge(person.getAge());
        return find;
    }

    @DeleteMapping("/people/{id}")
    public Person deleteById(@PathVariable Long id) {
        // find
        // delete
        Person find = list.stream()
        .filter(person -> person.getId() == id)
        .findFirst()
        .orElse(null);
        list.remove(find);
        return find;
    }




}