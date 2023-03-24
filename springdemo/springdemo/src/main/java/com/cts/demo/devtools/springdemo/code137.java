package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code137 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("table");
int table;
        for(int i=1;i<=10;i++){
            table=i*n;
            System.out.println(table);
        }
    }
    
}
