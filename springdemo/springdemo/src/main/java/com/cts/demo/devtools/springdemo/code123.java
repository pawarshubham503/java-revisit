package com.cts.demo.devtools.springdemo;

public class code123 {
    public static void main(String[] args) {
         int i=0,j=0;
         int row=4;
         for (i=row;i>=1;i--){
        
            for(j=row;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++);
            System.out.print("*");
         }
        System.out.println("");
    }
    
}
