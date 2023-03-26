package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code145 {


    public static void main(String[] args) {
      // sqaure rrot code

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n==0){
        System.out.println("0");
      }

      else{
        double num;
        double half=(double)n/2;
        do{
            num=half;
            half=(num+(n/num))/2;

        }while((num-half)!=0);
        System.out.println((int)half);  
    }
      
    }

}
