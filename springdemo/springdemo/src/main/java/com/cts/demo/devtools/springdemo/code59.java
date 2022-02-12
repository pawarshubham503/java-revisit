package com.cts.demo.devtools.springdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*Date Format Conversion
Given a date string in the format dd/mm/yyyy, write a program to convert the giv
en date to the format dd-mm-yy.*/
public class code59 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(convertDate(n));
	}
	public static String convertDate(String n) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d=sdf.parse(n);
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		String s=sdf1.format(d);
		return s;
	}
}
