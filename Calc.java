package com.example.springmvcdemo;


import org.springframework.stereotype.Service;

@Service
public class Calc implements ICalc {
    public Calc() {
        System.out.println("비지니스 로직 객체가 생성됨");
    }

    @Override
    public int calcSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    @Override
    public int calcEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0) sum += i;
        return sum;
    }
}
