package com.cts.demo.devtools.springdemo;
import java.util.ArrayList;
import java.util.List;

public class code169 {


    //stream api example 1
    public static void main(String[] args) {
        
        List<String> list=new ArrayList<String>();
        List<String> uniquelist=new ArrayList<String>();

        list.add("A");
        
        list.add("B");
        
        list.add("C");
        
        list.add("C");
        list.add("D");

        // // without stream
//         for(String s:list){
//             if(!uniquelist.contains(s)){
//                 uniquelist.add(s);
//             }
//         }
// System.out.println(uniquelist);


// // with stream

list.stream().distinct().forEach((x)->System.out.println(x));
    }
}


