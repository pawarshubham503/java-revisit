package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code147 {
    public static void main(String[] args) {
        // reverse number
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int rev =0;
        while (n>0){
            int rem=n%10;
            rev=rev+rem;
            n=n/10;
            if(n>0){
                rev=rev*10;
            }

        }
        System.out.println(rev);
    }
}
