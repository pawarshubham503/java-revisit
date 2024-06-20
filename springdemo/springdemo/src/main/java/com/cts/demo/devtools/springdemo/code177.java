package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.List;

public class code177 {

 
        
           //remove null from array list
    public static void main(String[] args) {
        
        List<String> list=new  ArrayList<String>();

        list.add("a");
        list.add("v");
        list.add("c");
        list.add("b");
        list.add("v");
        list.add("c");
        list.add(null);

        list.stream().distinct().filter((x)-> x!=null).sorted().map((y)->y.toUpperCase()).forEach(x-> System.out.println(x));
    }
    }

