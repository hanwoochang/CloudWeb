package com.example.springmvcdemo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CRUDController {

    @GetMapping("/people/{id}")
    public Person findById(@PathVariable Long id) {
        return new Person(id, "이순신", 45l);
    }

    @GetMapping("/people")
    public List<Person> findAll() {
        List list = new ArrayList<Person>();
        list.add(new Person(1l, "이순신222", 56l));
        list.add(new Person(2l, "임꺽정222", 45l));
        list.add(new Person(3l, "홍길동222", 78l));
        return list;
    }

    @PostMapping("/people")
    public Person save(@RequestBody Person person) {
        return person;
    }

    @PutMapping("/people/{id}")
    public Person updateById(@PathVariable Long id, @RequestBody Person person) {
        return person;
    }

    @DeleteMapping("/people/{id}")
    public Person deleteById(@PathVariable Long id) {
        return new Person(id, "홍길동222", 78l);
    }


}
