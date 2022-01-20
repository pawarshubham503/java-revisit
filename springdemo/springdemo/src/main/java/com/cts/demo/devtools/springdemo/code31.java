package com.cts.demo.devtools.springdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*Finding the day of birth
Given an input as date of birth of person, write a program to calculate on which
 day (MONDAY,TUESDAY....) he was born store and print the day in Upper Case lett
ers.*/

public class code31 {
public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	System.out.println("day is"+dayBorn(s1));
}
public static String dayBorn(String s1) throws ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
	Date d=sdf.parse(s1);
	String s=sdf1.format(d);
	return s.toUpperCase();
}
}
