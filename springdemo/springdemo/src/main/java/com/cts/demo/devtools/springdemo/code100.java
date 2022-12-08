package com.cts.demo.devtools.springdemo;

import java.util.stream.IntStream;

public class code100 {
    public static void main(String[] args) {
        	// Find all numbers greater than 2
       System.out.println( IntStream.range(1, 100).filter(n-> n>2).count());    
    }
}
