package com.cts.demo.devtools.springdemo;

import java.util.HashMap;

public class code83 {
    //count number of words in string using hashmap
    public static void main(String[] args) {
        String s= "This this is is done by Saket Saket";
        s=s.toLowerCase();
        String[] split=s.split(" ");
        HashMap<String ,Integer> map=new HashMap<String ,Integer>();
        for(int i=0; i<split.length; i++)
        {
            if(map.containsKey(split[i])){
                int count=map.get(split[i]);
                map.put(split[i],count+1);
            }
            else
            map.put(split[i], 1);
        }
        System.out.println(map);
    }

}
