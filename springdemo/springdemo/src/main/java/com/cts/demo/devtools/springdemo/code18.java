package com.cts.demo.devtools.springdemo;

import java.util.StringTokenizer;

//32
public class code18 {
public static void main(String[] args) {
	String ip="10.230.110.160";
	boolean b=validate(ip);
	if(b==true)
		System.out.println("valid ip");
	else
		System.out.println("invaid ip");
}
public static boolean validate(String ip) {
	boolean b1=false;
	StringTokenizer t=new StringTokenizer(ip,".");
	int a=Integer.parseInt(t.nextToken());
	int b=Integer.parseInt(t.nextToken());
	int c=Integer.parseInt(t.nextToken());
	int d=Integer.parseInt(t.nextToken());
	if((a>=0 && a<=255)&&(b>=0 && b<=255)&&(c>=0 && c<=255)&& (d>=0 && d<=255))
		b1=true;
	return b1;
}
}
