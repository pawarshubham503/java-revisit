package com.cts.demo.devtools.springdemo;

public class code79 {
   // code to find first non repeating char of string
   public static void main(String[] args) {
    System.out
    .println("First non repeated character for String analogy is : "
      + getNonRepeatedCharacter("shubham"));
  System.out
    .println("First non repeated character for String easiest is : "
      + getNonRepeatedCharacter("pawar"));
   }

public static Character getNonRepeatedCharacter(String str) {
char array[] =str.toCharArray();
for(int i=0; i<str.length(); i++){
    if(str.lastIndexOf(array[i])== str.indexOf(array[i]))
    return array[i];
}
return null;
}    
}
   

