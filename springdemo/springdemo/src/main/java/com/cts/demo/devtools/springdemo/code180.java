package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class code180 {


    public static void main(String[] args) {
        
        String s="JAVAappliction";
ArrayList<Character> ch=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ch.add(s.charAt(i));
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.putIfAbsent(ch.get(i), i);
        }

    for(Entry<Character, Integer> e:map.entrySet()){
        System.out.println("char :"+e.getKey()+"count" +e.getValue());
    }
    }
}
