package com.cts.demo.devtools.springdemo;

import java.util.Scanner;
//code to get frequency of numbers
public class code73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int d=sc.nextInt();
        int x= countfreq(n,d);
        System.out.println("the digit " +d + " occurs "+x + "times in"+n);
    }

    private static int countfreq(int n, int d) {

        if( n==0 && d==0) return 1;

        //if negative number entered
        if(n<=0) n=-n;
       int counter=0;

        while(n!=0){
            int digit= n%10;
            if(digit== d)
            counter++;
            n=n/10;


        }
        return counter;
    }
}
