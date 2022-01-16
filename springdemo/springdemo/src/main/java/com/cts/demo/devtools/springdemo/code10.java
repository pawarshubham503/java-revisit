package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//17
public class code10 {
public static int consecutiveSum(int n) {
	List<Integer> l1=new ArrayList<Integer>();
	for(int i=1;i<=n;i++)
		if(i%2!=0)
			l1.add(i);
	int n1=l1.get(0);
	for(int i=1;i<=l1.size();i++)
		n1=n1+l1.get(i);
	return n1;
}
public static void main(String[] args) {
	Scanner dc=new Scanner (System.in);
	int n=dc.nextInt();
	System.out.println(consecutiveSum(n));
}	
	
}
