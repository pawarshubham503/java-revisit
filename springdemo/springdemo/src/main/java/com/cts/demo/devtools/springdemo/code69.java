package com.cts.demo.devtools.springdemo;
//code to check if vowel present in string

public class code69 {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("hello"));//true
        System.out.println(stringContainsVowels("Tv"));// false

        
    }

    private static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
    
}
