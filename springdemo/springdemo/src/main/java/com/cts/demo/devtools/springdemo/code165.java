package com.cts.demo.devtools.springdemo;

public class code165 {
// Java program to get a specific character 
// from a given String at a specific index 


// cahrAt(index)
  public static char getcharfromstring (String str , int index){
    return str.charAt(index);

  }


  //toCharArray()[Index]
  public static char getcharArrayIndex(String str, int index){
    System.out.println("array index method called");
    return str.toCharArray()[index];
  }


  //using stream

  public static char stream(String str, int index){
    System.out.println("inside stream");
    return str.chars()
    .mapToObj(ch->(char)ch)
    .toArray(Character[]:: new)[index];
    
  }

public static void main(String[] args) {
   String str="shubham";
   int index=5;
   
   char ch=stream(str, index);
//char ch=getcharfromstring(str, index);
 //  char ch=getcharArrayIndex(str, index);
   System.out.println("char from  "+ str +  " at index   " + index + " is " +ch);

}
}
