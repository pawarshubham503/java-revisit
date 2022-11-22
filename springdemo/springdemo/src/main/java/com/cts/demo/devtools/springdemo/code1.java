package com.cts.demo.devtools.springdemo;

public class code1 {
public static int sumOfOddAndEvens(int n){

	System.out.println("hi");
	int n1,n2=0,n3;
	while(n!=0) {
	n1=n%10;
	if((n1%2)!=0) 
		n2+=n1;
		n/=10;
	
	}
	if(n2%2==0)
		n3=-1
	;
	else n3=1;
	return n3;
	
}
public static void main(String[] args) {
	int n=56895;
	System.out.println(sumOfOddAndEvens(n));
}
}
