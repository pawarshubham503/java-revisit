package com.cts.demo.devtools.springdemo;

public class code158 {
// java program to check whether input
// character is a vowel or consonant
  

    static void vowelCheck(char r){
        if (r=='a' ||r=='e'||r=='o'||r=='i'||r=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
    public static void main(String[] args) {
        
        vowelCheck('a');
        vowelCheck('t');
    }
}
