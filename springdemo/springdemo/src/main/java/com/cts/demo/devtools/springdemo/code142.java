package com.cts.demo.devtools.springdemo;
// 1
// 21
// 321
// 4321
// 54321
public class code142 {
    public static void main(String[] args) {
        int n=4;
        int i,j;

        for (i=0;i<=n;i++){
            int  o=1+i; 
            for(j=0;j<=i;j++){
                
                System.out.print(o);
                o--;
            }
        
            System.out.println("");
        }
    }
}
