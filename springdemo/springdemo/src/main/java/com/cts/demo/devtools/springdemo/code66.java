package com.cts.demo.devtools.springdemo;

public class code66 {

	public static void main(String[] args) {

		String str="www.scaler.com/topics";
		char ch= 'w';
		int cnt=0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch)
				cnt ++;
		}
		System.out.println("count of  " + ch +" is " +cnt);
	}
}
