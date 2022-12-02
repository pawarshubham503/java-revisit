package com.cts.demo.devtools.springdemo;

import java.util.Arrays;
import java.util.List;

import ch.qos.logback.core.net.SyslogOutputStream;

public class code89 {
    //java8 to find even numbers
    public static void main(String[] args) {
        List<Integer> List=Arrays.asList(10,15,8,49,25,98,32);
      List.stream()
      .filter(n-> n%2 ==0)
      .forEach(System.out::println);
      
    }
}
