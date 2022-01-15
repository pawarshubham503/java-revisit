package com.cts.demo.devtools.springdemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

//code number 10 validate time
public class code7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	StringTokenizer st=new StringTokenizer(str,":");
	if(st.countTokens()==3) {
		SimpleDateFormat sdf1=new SimpleDateFormat("h:mm:ss a");
		sdf1.setLenient(false);
		try {
			Date d2=sdf1.parse(str);
			System.out.println("valid time");
		}catch(Exception e)
		{
			System.out.println("invalid time");
		}
	}else
	{
		SimpleDateFormat sdf=new SimpleDateFormat("h:mm a");
		sdf.setLenient(false);
		try {
			Date d1=sdf.parse(str);
			System.out.println("valid time");
		}catch(Exception e)
		{
			System.out.println("invalid time");
		}
	}
	
}
}
