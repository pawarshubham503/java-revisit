package com.cts.demo.devtools.springdemo;


import java.util.stream.Collectors;

public class code179 {

    

public static void main(String[] args) {
    String input="javaApplication";
    String outputString=(String) sortString(input);

    System.out.println(outputString);



}

public static Object sortString(String input) {

   
//    char tempArray[]=input.toCharArray();

//    Arrays.sort(tempArray);                      
//    return new String(tempArray);

return input.chars().mapToObj((c)->(char)c).sorted().map(String::valueOf).collect(Collectors.joining());
}}

