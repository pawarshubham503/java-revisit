package com.cts.demo.devtools.springdemo;

public class code67 {
// reverse array
	
	public static void main(String[] args) {
		int arr[]= {40,30,20,10};
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	for(int i : arr) {
		System.out.print( i+ ",");
		
		
	}
	
}}
