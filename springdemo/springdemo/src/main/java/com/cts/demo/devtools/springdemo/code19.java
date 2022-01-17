package com.cts.demo.devtools.springdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class code19 {
public static void main(String[] args) throws ParseException {
	String s1="2012-03-12";
	String s2="2012-03-14";
	System.out.println(checkdiff(s1,s2));
	}
public static int checkdiff(String s1,String s2) throws ParseException {
	SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
	Date d=sd.parse(s1);
	Calendar c=Calendar.getInstance();
	c.setTime(d);
	long d1=c.getTimeInMillis();
	d=sd.parse(s2);
	c.setTime(d);
	long d2=c.getTimeInMillis();
	int n=Math.abs((int) ((d1-d2)/(1000*3600*24)));
	return n;
}
}
