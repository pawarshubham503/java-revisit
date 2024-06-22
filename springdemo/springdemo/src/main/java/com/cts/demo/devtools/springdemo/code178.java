package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class code178 {
    public static void main(String[] args) {
         List<Integer> list=new  ArrayList<Integer>();
        list.add(40000);
        list.add(20000);
        list.add(46000);
        list.add(13000);
        list.add(10000);


    list.stream().filter((x)->x<40000).forEach((x)->System.out.println(x));
    }
}
