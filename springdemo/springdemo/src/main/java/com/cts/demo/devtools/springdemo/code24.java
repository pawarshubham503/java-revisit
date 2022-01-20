package com.cts.demo.devtools.springdemo;

/*109.Get a string as input and write code to count the number of characters which
gets repeated 3 times consecutively and return that count (ignore case). If no
character gets repeated 3 times consecutively return -1.*/
public class code24 {
public static void main(String[] args) {
	String s1="aaxxxyzAAx";
	System.out.println("op"+consecutiverep(s1));
}
public static int consecutiverep(String s1) {
	int c=0;
	int n=0;
	for(int i=0;i<s1.length()-1;i++) {
		if (s1.charAt(i)==s1.charAt(i+1))
			n++;
		else 
			n=0;
		if(n==2)
			c++;
	}return c;
}
}
