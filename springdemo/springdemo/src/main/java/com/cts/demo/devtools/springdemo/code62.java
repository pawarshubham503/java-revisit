package com.cts.demo.devtools.springdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class code62 {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 1, 8, 7, 5, 3 };

		Map<Integer, Integer> arrMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (arrMap.containsKey(arr[i])) {
				arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
			} else {
				arrMap.put(arr[i], 1);
			}
		}
		Set<Entry<Integer, Integer>> entry = arrMap.entrySet();
		/*
		*Traverse the map, If any key has value greater than 1
		*It means, it is duplicate element in an array
		*/	
		for(Entry<Integer, Integer> ent: entry) {
		if(ent.getValue() > 1) {
		System.out.println(ent.getKey());
		}
	}

}}