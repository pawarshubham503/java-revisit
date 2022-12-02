package com.cts.demo.devtools.springdemo;

import java.util.stream.IntStream;

public class code94 {
    //CountNumberOfElementsInIntStream
    public static void main(String[] args) {
        long count=IntStream.of(1,2,3,4,5).count();
        System.out.println("count :"+count);
    }
}
