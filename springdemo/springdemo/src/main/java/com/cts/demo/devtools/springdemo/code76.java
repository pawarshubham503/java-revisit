package com.cts.demo.devtools.springdemo;

import java.util.HashSet;

public class code76 {
   //code to check if string has unique chars
   public static void main(String[] args) {
    System.out.println("java2blog has all unique chars : "+ hasAllUniqueChars("java2blog"));
    System.out.println("Apple has all unique chars : "+ hasAllUniqueChars("apple"));
    System.out.println("index has all unique chars : "+ hasAllUniqueChars("index"));
    System.out.println("world has all unique chars : "+ hasAllUniqueChars("world"));
  }

private static boolean hasAllUniqueChars(String word) {
    HashSet set=new HashSet();
    for (int index =0; index<word.length(); index ++)
    {
        char c= word.charAt(index);
        if(!set.add(c))
        return false;
    }
    return true;

}

   } 

