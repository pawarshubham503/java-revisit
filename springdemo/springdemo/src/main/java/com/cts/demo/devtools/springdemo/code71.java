package com.cts.demo.devtools.springdemo;

public class code71 {
    //to print fibonnaci
    /**
     * @param args
     */
    public static void main(String[] args) {
     Integer printFibonacciSeries(int count) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }   
    }
    
}
 