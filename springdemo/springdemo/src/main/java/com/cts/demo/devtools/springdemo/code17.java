package com.cts.demo.devtools.springdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//30
public class code17 {
public static void main(String[] args) throws ParseException {
	String s1="2012-03-01";
	String s2="2012-06-16";
	System.out.println(monthDiff(s1,s2));
}

public static int monthDiff(String s1, String s2) throws ParseException {
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
Date d1=sdf.parse(s1);
Date d2=sdf.parse(s2);
Calendar cal=Calendar.getInstance();
cal.setTime(d1);
int months1=cal.get(Calendar.MONTH);
int year1=cal.get(Calendar.YEAR);
cal.setTime(d2);
int months2=cal.get(Calendar.MONTH);
int year2=cal.get(Calendar.YEAR);
int n=((year2-year1)*12)+(months2-months1);
return n;

}
}
