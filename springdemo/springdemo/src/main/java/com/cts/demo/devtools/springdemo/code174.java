package com.cts.demo.devtools.springdemo;

import java.util.Arrays;

public class code174 {
    public static void main(String[] args) {

        int[] a = { 10, 11, 12, 13 };
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("min value is : "+min);
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("max value is : "+max);
    }
}
