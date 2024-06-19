package com.cts.demo.devtools.springdemo;

import java.util.Arrays;

public class code170 {

    // find length of array

    public static void main(String[] args) {
        int[] a={2,3,4};
        // System.out.println(a.length);

        // // with stream
        long count=Arrays.stream(a).count();
        System.out.println(count);

    }
}
