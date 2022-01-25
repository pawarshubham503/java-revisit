package com.cts.demo.devtools.springdemo;

/*Write a program to read a integer array, find the largest difference between adj
acent elements and display the index of largest difference.
EXAMPLE:
input1: {2,4,5,1,9,3,8}
output1: 4*/
public class code47 {

	public static void main(String[] args) {
		int[] n1= {2,4,5,1,9,3,8};
		
	}
	public static int getIndex(int[]n1)
	{int n2,n3=0,n4=0,i;

		for(i=0;i<n1.length-1;i++){
			n2=Math.abs(n1[i]-n1[i+1]);
			if(n2>n3){
			n3=n2;
			n4=i+1; }}
			return n4;
	}
}
