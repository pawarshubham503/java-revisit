package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*a program to input a String and a character, and remove that character fro
m the given String. Print the final string.
Include a class UserMainCode with a static method removeCharacter which accepts
a string and a character. The return type (string) should return the character c
leaned string.
Create a Class Main which would be used to accept Input String and call the stat
ic method present in UserMainCode.
Input and Output Format:
Input consists of a string and a character.
Output consists of a string(the character cleaned string).
Refer sample output for formatting specifications.
Sample Input :
elephant
e
Sample Output:
Lphant*/
public class code22 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String name=sc.nextLine();
	char ch=sc.nextLine().charAt(0);
	StringBuffer sb=new StringBuffer(name);
	for(int i=0;i<sb.length();i++)
	{
		if(ch==sb.charAt(i)) {
			sb.deleteCharAt(i);
			i--;
	
		}
	}
	System.out.println(sb.toString());	
}
}
