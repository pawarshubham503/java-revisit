package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

// code to take n and chose if we want sum or prod of n elements

public class code148 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int choice=sc.nextInt();
        int ans=1;
        switch(choice)
        {
            case 1:
            for(int i=2;i<=n;i++){
                ans=ans+i;            }
                break;

                case 2:
                for(int i=2;i<=n;i++){
                    ans=ans*i;
                }
                break;
        
                default:
                ans=-1;
                break ;
        }
        System.out.println(ans);
       

    }
}
