package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

//102. code get a password as string input and validate using the rules spe
//cified below. Apply following validations:
//1. Minimum length should be 8 characters
//2. Must contain any one of these three special characters @ or _ or #
//3. May contain numbers or alphabets.
//4. Should not start with special character or number
//5. Should not end with special character
public class code15{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
boolean b=passwordValidation(s1);
if(b==true)
System.out.println("valid password");
else
System.out.println("not a valid password");
}
public static boolean passwordValidation(String s1) {
boolean b=false,b1=false,b2=false;
if(s1.length()>=8)
if(!Character.isDigit(s1.charAt(0)))
if(s1.charAt(0)!='@' && s1.charAt(0)!='_' && s1.charAt(0
)!='#')
if(s1.charAt(s1.length()-1)!='@' && s1.charAt(s1
.length()-1)!='_' && s1.charAt(s1.length()-1)!='#')
b1=true;
if(b1==true)
for(int i=0;i<s1.length();i++)
if(Character.isAlphabetic(s1.charAt(i)) || 

		Character.isDigit(s1.charAt(i)) || s1.charAt(i)=='#' || s1.charAt(i)=='@' || s1.charAt(i)=='_')
b2=true;
if(b2==true)
if(s1.contains("#") || s1.contains("@") || s1.contains("_"))
b=true;
return b;
}
}