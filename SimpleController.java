package com.example.springmvcdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.Map;

@Controller
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "<h1>Hello</h1>";
    }

    @RequestMapping("/loop")
    @ResponseBody
    public String loop() {
        String[] data = {"food", "drink", "water"};
        String html = "<html><ol>";
        for (String s : data)
            html += "<li>" + s + "</li>";
        html += "</ol></html>";
        return html;
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("now", LocalDate.now());
        return "test";
    }


    @RequestMapping("/view")
    public String view(Model model) {

        model.addAttribute("id", "45");
        model.addAttribute("name", "hong");
        model.addAttribute("html", "<h1>Hello</h1>");

        model.addAttribute("person", new Person(5, "lee", 40));
        model.addAttribute("person2", new Person(15, "이순신", 60));

        Person p3 = new Person(100, "홍길동", 50);
        model.addAttribute("p3", p3);

        int[] score = {95, 45, 87};
        model.addAttribute("score", score);

        return "view";
    }

    @GetMapping("/first")
    public Map<String, Object> firstController() {
        return null; // Hashmap 객체
    }



}
