package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code136 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans =1;


        if(x==0){
            if(n==0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
        else{
            for(int i=0;i<n;i++){
                ans=ans*x;

            }
            System.out.println("ans"+ "  "+ans);
        }
    }
    
}
