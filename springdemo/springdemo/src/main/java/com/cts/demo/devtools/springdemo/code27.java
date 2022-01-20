package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Write a program to input a String array. The input may contain digits and alphab
ets ( de5g4G7R ). Extract odd digits from each string and find the sum and print the
 output.
For example, if the string is "AKj375A" then take 3+7+5=15 and not as 375 as dig
it.
*/
public class code27 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int s1=sc.nextInt();
	String[] s2=new String [s1];
	for(int i=0;i<s1;i++) {
		s2[i]=sc.next();
	}System.out.println(getSum(s2));
}

public static int getSum(String[] s1) {
	int sum=0;
	for(int i=0;i<s1.length;i++)
		for(int j=0;j<s1[i].length();j++) {
			char c=s1[i].charAt(j);
			if (Character.isDigit(c)) {
				if(c%2!=0) {
					String t=String.valueOf(c);
					int n=Integer.parseInt(t);
					sum=sum+n;
				}
			}
		}
	return sum;

}
}
