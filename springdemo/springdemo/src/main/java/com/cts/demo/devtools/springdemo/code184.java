package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//remove duplicate in string using Hashset
public class code184 {
public static void main(String[] args) {

String str="shubham";
System.out.println(Removeduplicates(str));
}
public static String Removeduplicates(String str){

Set<Character> set=new HashSet<>();
StringBuffer sb=new StringBuffer();
for(int i=0;i<str.length();i++){
    Character c=str.charAt(i);
    if(!set.contains(c)){
        set.add(c);
        sb.append(c);
    }
}
return sb.toString();

}

}

