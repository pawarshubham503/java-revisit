package com.cts.demo.devtools.springdemo;

public class code63 {
	
	//Panagram check code
	
	public static void main(String[] args) {
		String S="the quick brown fox jumps over the lazy dog";
		System.out.println( isPanagram(S.toLowerCase())); 
	}

	private static boolean isPanagram(String S) {
		// TODO Auto-generated method stub
		if(S.length()<26) {
			return false;
			
		}
		else {
			for(char ch='a';ch<='z';ch++) {
				if(S.indexOf(ch)<0){
					return false;
				}
			}
		}return true;
	}

}
 