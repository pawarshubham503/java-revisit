package com.cts.demo.devtools.springdemo;

public class code167 {

    //to reverese string using str.charAt

    public static void main(String[] args) {
        
        String str="Shubham" ,rstr="";
        char ch;
         System.out.println("original string :"+str);


         // // using string
        //  for(int i=0; i<str.length();i++){
        //     ch=str.charAt(i);
        //     rstr=ch+rstr;  
            
        //  }

        StringBuilder input =new StringBuilder();
        input.append(str);
        input.reverse();
         System.out.println("reversed String :"+ input);

    }
}
