package com.cts.demo.devtools.springdemo;

public class code80 {
  //code to get length of string without using any inbuilt method
  
  public static void main(String[] args) {
    String s= "shubham pawar  ";
    System.out.println("length of string is  == " +getLength(s));

    
  }
  public static int getLength(String s){
    int length=0;
    char arrayString[]=s.toCharArray();
    for(char c: arrayString){
        length ++;
    }
    return length;
  }
}
