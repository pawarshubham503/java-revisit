package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code84 {
    //code to check number is prime

    public static void main(String[] args) {
        int temp,num;
        boolean isPrime=true;
        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();

        sc.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0){
                isPrime=false;
                break;
            }

        }
        if(isPrime)
        System.out.println("prime "+num);
        else System.out.println("not prime" +num);
    }
}
