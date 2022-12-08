package com.cts.demo.devtools.springdemo;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class code102 {
  
    public static void main(String[] args) {
        OptionalInt maximum=IntStream.range(1, 10).max();
        System.out.println(maximum.getAsInt());
    }
}
