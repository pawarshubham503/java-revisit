package com.cts.demo.devtools.springdemo;

import java.util.stream.IntStream;

public class code99 {
    public static void main(String[] args) {
        
        //java 8 code for finding even numbers

        IntStream.range(1, 6).filter(num->num%2 == 0 ).forEach(System.out::println);
        
    }
}
