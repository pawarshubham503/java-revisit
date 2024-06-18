package com.cts.demo.devtools.springdemo;

public class code166 {

    // substring practice
public static void main(String[] args) {
    
   
    String str="Geeks Gor Geeks";
    int index=6;
    char ch='F';

   // // using String Class
    // str = str.substring(0, index) + ch + str.substring(index + 1);
   


    // // using string builder
    StringBuilder string= new StringBuilder(str);
    string.setCharAt(index, ch);

     System.out.println(str);

}
    
}
