package com.cts.demo.devtools.springdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//code number 9 validate date
public class code6 {

	public static void main(String[] args) {
		String s1="03/01/1987";
		getValues(s1);
	}
	
	public static void getValues(String s1) {
		if(s1.matches("[0-9]{2}[/]{1}[0-12]{2}[/]{1}[0-9]{4}")) {
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			try {
				Date d1=sdf.parse(s1);
				System.out.println(1);
				
			}catch(ParseException e) {
				System.out.println(-1);
			}
		}else
			System.out.println(-1);
	}
}
