package com.cts.demo.devtools.springdemo;

import java.util.stream.Stream;

import javax.print.event.PrintEvent;

public class code97 {
    //CreateStreamOfIntege
    public static void main(String[] args) {
        
        Stream<Integer> streamOfInteger=Stream.of(11,12,13);
        Stream<Integer> streamOfInteger2=Stream.of(new Integer[]{11,12,13,14});
     

        streamOfInteger.forEach(System.out::println);
        streamOfInteger2.forEach(System.out::println);
        
      
        
    }
}
