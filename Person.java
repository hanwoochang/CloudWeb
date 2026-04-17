package com.example.springmvcdemo;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private long id;
    public String name;
    private long age;
}
