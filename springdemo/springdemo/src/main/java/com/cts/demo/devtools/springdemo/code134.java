package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code134 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int s=sc.nextInt();
         int e=sc.nextInt();
         int w= sc.nextInt();

         while(s<=e){
            int c=(s-32)*5/9;
            System.out.println(s+ "\t" +c);
            s=s+w;
         }
    }
}
