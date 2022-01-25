package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*GIven three integers (a,b,c) , Write a program that returns the number of unique
integers among the three.*/

public class code36 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a =sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println(display(a, b, c));
}
public static int display(int a,int b,int c)
{
int d=0;
if(a!=b&&a!=c)
{
d=3;
}
else if(a==b&&a==c)
{
d=1;
}
else if(a!=b&&a==c)
{
d=2;
}
else if(a==b&&a!=c)
{
d=2;
}
return d;
}
}

