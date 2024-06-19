package com.cts.demo.devtools.springdemo;

import java.util.Arrays;
//filter even numbers
public class code173 {
public static void main(String[] args) {
    int []a={10,2,4,5,18,20,13};

    Arrays.stream(a).filter((x)->x%2==0).forEach((x)->System.out.println(x));
}
}
