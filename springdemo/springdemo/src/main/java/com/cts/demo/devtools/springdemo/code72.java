package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code72 {
   // code to count digits in a number
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt(); 
    System.out.println("the number of digits in " + n + " are " +countDigits(n));
   }

private static int countDigits(int n) {
    if (n==0)
    return 1;

    //if negative number id entred
    if(n<=0) n=-n;
     int result =0;
     while(n!=0){
        n=n/10;
        result++;
     }

    return result;
} 
}
