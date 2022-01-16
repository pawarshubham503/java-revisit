package com.cts.demo.devtools.springdemo;

public class code14 {
	
	public static void main(String[] args) {

		String s1="CTS-2j4";
		getvalues(s1);
	}
public static void getvalues(String s1) {
	if(s1.matches("(CTS)[-]{1}[0-9]{3}")) 
		{System.out.println("valid");
		}
	else
		System.out.println("invalid");
}

}
