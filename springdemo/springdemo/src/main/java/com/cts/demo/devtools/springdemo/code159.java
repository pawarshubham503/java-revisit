package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.HashMap;

public class code159 {
   
    public static void main(String[] args) {
        
        //Arraylist 
        //1. Insertion order is preserved
       //2. Duplicate objects are allowed
        ArrayList<String> i=new ArrayList<String>();
        
        
//set
//         Insertion order is not preserved
// 2. Duplicates are not allowed.If we are trying to add duplicates then we won't get any error, just
// add() method returns false
       // HashSet<String> i=new HashSet<String>();
        i.add("Sunny");
        i.add("Bunny");
        i.add("chinny");
        i.add("Sunny");
        System.out.println(i);
   

//Map
    HashMap<String,String> m=new HashMap<String,String>();
     m.put("A","Apple");
     m.put("Z","Zebra");
     m.put("Durga","Java");
     m.put("B","Boy");
     m.put("T","Tiger");
     System.out.println(m); 
    }
}
