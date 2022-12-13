package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code114 {
    public static void main(String[] args) {
        
        //farenhiet to celcius
       Scanner sc=new Scanner(System.in);
       int s,e,w;
        s=sc.nextInt(); 
         e=sc.nextInt(); 
        w=sc.nextInt(); 

        while(s<e){
            int c=(s-32)*5/9;
            System.out.println(s+ "\t"+ c);
        s+=w;

        }
        sc.close();
    }
}
