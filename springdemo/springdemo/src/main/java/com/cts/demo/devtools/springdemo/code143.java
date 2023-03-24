package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code143 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int count =0;

        while(n>0 ){
            int rem=n%10;
            ans=ans+(int )rem*(int)Math.pow(2, count);
            count=count+1;
            n=n/10;

        }
        System.out.println(ans);
    }
    
}
