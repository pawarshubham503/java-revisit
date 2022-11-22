package com.cts.demo.devtools.springdemo;

public class code71 {
    //to print fibonnaci
    public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String args[]) {
		int n = 10;
		System.out.println(fibonacci(n));
	}
}
 