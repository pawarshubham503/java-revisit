package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class coode143 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
 for (int i=2;i<=n;i++)
        {
            int flag=0;
           for (int j=2;j<=i;j++)
            {
                if (i%j==0 && i!=j)
                {
                    flag=1;
                    break ;
                }
            }
            if (flag==0)
            {
                System.out.println(i);
            }
            else
            {
                flag=0;
            }
        }
        scan.close();

    }
    
}
