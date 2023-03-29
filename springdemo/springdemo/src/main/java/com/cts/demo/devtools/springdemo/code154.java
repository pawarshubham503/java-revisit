package com.cts.demo.devtools.springdemo;

//Ternary operator check largets number

public class code154 {
    public static void main(String[] args) {

        int a=10;int b=20;
        int c=7;

      int largest =a>(b>c?b:c)?a:((b>c)?b:c);
      System.out.println(largest);
    }
}
