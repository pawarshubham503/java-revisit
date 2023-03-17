package com.cts.demo.devtools.springdemo;

public class code120 {
public static void main(String[] args) {
    int i,j,row=6;
    for(i=1;i<=row;++i){
        for(j=1;j<=i;++j){
            System.out.print("*");
        }
        System.out.println("");
    }

    for(i=row-1;i>=1;--i){
        for(j=1;j<=i;++j){
        System.out.print("*");
        }
        System.out.println("");
    }
}   
}
