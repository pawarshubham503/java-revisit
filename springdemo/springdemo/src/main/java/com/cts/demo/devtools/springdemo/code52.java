package com.cts.demo.devtools.springdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*Largest Key in HashMap
Write a program that construts a hashmap and returns the value corresponding to
the largest key*/
public class code52 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	HashMap<Integer, String> hm=new HashMap<Integer,String>();
	for (int i=0;i<n;i++)
	{
		hm.put(sc.nextInt(), sc.next());
		System.out.println(getmaxKey(hm));
	}
	
}
public static String getmaxKey(HashMap<Integer, String> hm) {
	
	int max=0;
	String nn=null;
	Iterator<Integer> it=hm.keySet().iterator();
	while(it.hasNext())
	{
		int key=it.next();
		String name=hm.get(key);
		if(key>max)
		{
		key=max;
		nn=name;
		}

	}
	return nn;
}
}
