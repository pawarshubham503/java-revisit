package com.cts.demo.devtools.springdemo;
//calculator

import java.util.Scanner;

public class code37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char op=sc.next().charAt(0);
		System.out.println(calculateUnique(a,b,op));
		}
		

		public static int calculateUnique(int a,int b,char op)
		{
		 int res=0;
		 switch(op){

		 case '+':
		 res=a+b;
		 case '-':
		 res=Math.abs(a-b);
		 case '*':
		 res=a*b;
		 case '/':
		 res=Math.round(a/b);
		 case '%':
		 res=Math.round(a%b);
		 }
		 return res;
		
}}
