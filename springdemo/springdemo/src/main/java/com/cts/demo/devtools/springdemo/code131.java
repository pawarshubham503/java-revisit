package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code131 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =sc.next();
        int m1,m2,m3;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int avg = (m1+m2+m3)/3;
        System.out.println( "avg marks of "+ name +"is" + avg);
        
    }
}
