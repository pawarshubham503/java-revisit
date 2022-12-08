package com.cts.demo.devtools.springdemo;

import java.util.stream.IntStream;

public class code106 {
    	// Find sum of all even numbers between 1 to 5
    public static void main(String[] args) {
        int sum=IntStream.of(1,2,3,4,5).filter(n->n%2==0).sum();
        System.out.println(sum);
    }
}
