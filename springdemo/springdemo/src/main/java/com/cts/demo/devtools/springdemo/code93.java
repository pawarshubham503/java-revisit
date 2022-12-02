package com.cts.demo.devtools.springdemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class code93 {
    //ConvertArrayListOfStringToStream
    public static void main(String[] args) {
       
        List<String> list= new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
    
       Stream<String> streamofString=list.stream();
       streamofString.forEach(System.out::println);


    }
}
