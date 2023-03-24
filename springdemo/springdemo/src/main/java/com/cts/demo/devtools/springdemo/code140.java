package com.cts.demo.devtools.springdemo;

public class code140 {
    public static void main(String[] args) {
        int i,j,n=5;
        for ( i=0;i<n;i++){
            int ch=65+(n-1)-i;
            for (j=0;j<=i;j++){
              
                System.out.print((char)ch);
                ch++;
            }
            System.out.println("");
        }
    }
}
