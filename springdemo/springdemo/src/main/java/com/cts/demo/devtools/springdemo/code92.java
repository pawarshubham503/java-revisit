package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class code92 {
   //ConvertArrayListOfIntegerToStream 
   public static void main(String[] args) {
    System.out.println( " step 1. create list of integer");
    List<Integer> list=new ArrayList<>();
    list.add(11);
    list.add(12);
    list.add(13);
    list.add(14);
    list.add(15);
    list.add(16);
    System.out.println( "step 2. convert Arraylist of integer to stream ");
    Stream<Integer> streamofInteger=list.stream();

    System.out.println("step 3 display stream of integer");
    streamofInteger.forEach(System.out::println);




   } 
}
