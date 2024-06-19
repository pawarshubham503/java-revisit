package com.cts.demo.devtools.springdemo;

import java.util.Arrays;

//to print elements of ARRSY using stream
public class code171 {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4 };
        Arrays.stream(a).forEach((x)->{System.out.println(x);});
    }

}
