package com.cts.demo.devtools.springdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class code54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<String,String> hm= new HashMap<String,String>();
		for(int i=0;i<n;i++)
		hm.put(sc.next(),sc.next());
		String s=sc.next();
		System.out.println(getCapital(hm,s));

		}


	public static String getCapital(HashMap<String,String> hm,String s){
		Iterator<String> it=hm.keySet().iterator();
		StringBuffer sb= new StringBuffer();
		while(it.hasNext())
		{
		String state=it.next();
		String cap=hm.get(state);
		if(state.equalsIgnoreCase(s))
		{
		sb.append(cap).append('$').append(state);
		}
		}
		return sb.toString().toLowerCase();
		}

}

