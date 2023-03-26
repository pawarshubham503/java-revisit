package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code149 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int count =0;
        for(int i=1;count<x;i++){
            int val=(3*i)+2;
            if(val!=4)
            {
                System.out.println(val);
                count++;
            }
        }
        }
    }
    

