package com.cts.demo.devtools.springdemo;

public class code166 {

    // substring practice
public static void main(String[] args) {
    
    String str="Geeks Gor Geeks";
    int index=6;
    char ch='F';

  
    str = str.substring(0, index) + ch + str.substring(index + 1);
    System.out.println(str);

}
    
}
