package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code112 {
    public static void main(String[] args) {
        
        //evenOdd Sum
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int oddsum=0,evensum=0;
        while(N>0){
           int remainder=N%10;
           if(remainder%2==0){
            evensum=evensum+remainder;
           }
           else
           oddsum=oddsum +remainder;
           N=N/10;
        }
       

        System.out.println(evensum+" "+oddsum);

    }
}
