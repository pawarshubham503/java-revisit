package com.cts.demo.devtools.springdemo;

import java.util.stream.IntStream;

public class code101 {
    public static void main(String[] args) {
        //Find all odd numbers between 1 to 5
        IntStream.range(1, 6).filter(n-> n%2==1).forEach(System.out::println);
        
    }
}
