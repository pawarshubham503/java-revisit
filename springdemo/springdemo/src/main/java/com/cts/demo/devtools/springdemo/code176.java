package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.List;

public class code176 {

   
           //remove duplicates from array list
    public static void main(String[] args) {
        
        List<String> list=new  ArrayList<String>();

        list.add("a");
        list.add("v");
        list.add("c");
        list.add("c");

        list.stream().distinct().forEach(x-> System.out.println(x));
    }
    }

