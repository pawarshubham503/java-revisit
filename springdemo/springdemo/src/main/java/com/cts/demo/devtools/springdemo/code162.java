package com.cts.demo.devtools.springdemo;

public class code162 {

    //input using buffered reader
    public static void main(String[] args) {
       int n=5,m=6;
       int temp=0;
       
       temp=n;
       n=m;
       m=temp;

       System.out.println("new n value" +" " + n);
       System.out.println("new m value" +" " +m);
    }
}
