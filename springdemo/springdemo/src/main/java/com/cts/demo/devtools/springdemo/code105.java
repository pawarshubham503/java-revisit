package com.cts.demo.devtools.springdemo;

import java.util.stream.IntStream;

public class code105 {
    // find sum of all between 1 to 5 and add 10 to that
    public static void main(String[] args) {
        int reduce=IntStream.of(1,2,3,4,5).reduce(10,(x,y)->x+y);
        System.out.println(reduce
        );
    }
}
