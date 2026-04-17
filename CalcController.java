package com.example.springmvcdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalcController {

    @Autowired
    private ICalc calc;

    @RequestMapping("/sum/{n}")
    @ResponseBody
    public String sum(@PathVariable("n") int n) {
        int sum = calc.calcSum(n);
        return "1~" + n + "까지 짝수 합은 " + sum + "입니다";
    }
    @RequestMapping("/even/{n}")
    @ResponseBody
    public String even(@PathVariable("n") int n) {
        int sum = calc.calcEven(n);
        return  "1~" + n + "까지 짝수 합은 " + sum + "입니다";
    }
}
