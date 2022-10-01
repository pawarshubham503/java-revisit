package com.cts.demo.devtools.springdemo;

import java.util.HashSet;

public class code64 {
	// code to find intersection of two arrays ie common elements
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 4, 6, 7, 8 };

		printIntersection(arr1, arr2);
	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);

		}
		for (int i = 0; i < arr2.length; i++) {

			if (hs.contains(arr2[i])) {

				System.out.println(arr2[i]);

			}
		}
	}
}
