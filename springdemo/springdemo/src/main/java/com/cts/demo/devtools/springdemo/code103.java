package com.cts.demo.devtools.springdemo;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class code103 {
// Find minimum of all numbers in IntStream
       
        public static void main(String[] args) {
            OptionalInt mini =IntStream.of(9,12,45,74,11,1225,2).min();
            System.out.println(mini.getAsInt());
        }
    
}
