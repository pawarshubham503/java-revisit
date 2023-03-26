package com.cts.demo.devtools.springdemo;

import java.util.Scanner;
//print nth element fibonacci
public class code146 {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

     int n=sc.nextInt();
     int a=1,b=1;
     int c=0;
     
     for (int i=2;i<n;i++){
        c=a+b;
        b=c;a=b;
        
     }
     System.out.println(c);
    }
    
}
