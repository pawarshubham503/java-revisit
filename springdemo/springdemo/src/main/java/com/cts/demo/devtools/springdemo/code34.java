package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code34 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s=sc.next();
	boolean b=getvalue(s);
	System.out.println(b);
}
public static boolean getvalue(String s) {
	boolean b=false;
	if(s.length()==3) {
		if(s.matches("[A-za-z]{3}"))
			b=true;
	}else
		b=false;
	return b;
}

}
