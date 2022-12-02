package com.cts.demo.devtools.springdemo;

import java.util.Arrays;
import java.util.List;

public class code90 {
    public static void main(String[] args) {
        //java 8 code to find find out all the numbers starting with 1 using Stream functions
        List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);

        list.stream()
            .map(s->s +"")
            .filter(s->s.startsWith("1"))
            .forEach(System.out::println);
    }
}
