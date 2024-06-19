package com.cts.demo.devtools.springdemo;

import java.util.Arrays;

public class code172 {

    //sort arrays
    public static void main(String[] args) {
        int[] a = { 2, 35, 4 };
        // Arrays.sort(a);
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

        Arrays.stream(a).sorted().forEach((x)->{System.out.println(x);});
   
    }
    
}
