package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code175 {

    //remove null from array list
    public static void main(String[] args) {
        
        List<String> list=new  ArrayList<String>();

        list.add("a");
        list.add("v");
        list.add("c");
        list.add(null);

        list.stream().filter((x)-> x!=null).forEach(x-> System.out.println(x));
    }
}
