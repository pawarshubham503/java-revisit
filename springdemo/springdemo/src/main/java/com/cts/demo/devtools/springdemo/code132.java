package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

import ch.qos.logback.core.net.SyslogOutputStream;

public class code132 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         int N =sc.nextInt();
         int oddsum=0, evensum=0;
         while(N>0){
            int rem=N%10;
            if(rem%2==0){
                evensum=evensum+rem;
                System.out.println(evensum);
                System.out.println("11111111111111");
            }
            else{
            oddsum=oddsum+rem;
            System.out.println(oddsum);
        }         N=N/10;
         }System.out.println(evensum + " "+ oddsum);
         sc.close();

    }

    
}
