package com.cts.demo.devtools.springdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//code to get current date
public class code32 {
public static void main(String[] args) throws ParseException {
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
	String strDate=sdf.format(cal.getTime());
	System.out.println("current date in string format"+strDate);
	
	SimpleDateFormat sdf1 =new SimpleDateFormat();
	sdf1.applyPattern("dd/MM/yyyy HH:mm:ss.SS");
	Date date=sdf1.parse(strDate);
	System.out.println("current date in date format"+date);
}
}
