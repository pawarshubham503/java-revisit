package com.cts.demo.devtools.springdemo;

//Corresponding Celsius values and print the table.

public class code151 {
   public static void main(String[] args) {
    
printFtoC(0, 100, 20);
   }

   public static void printFtoC (int start,int end ,int step){
    for (int i=start;i<=end;i=i+step){
        double cel=(5*(i-32))/9;
        System.out.println(i+"  "+ cel);
    }
   }
}
