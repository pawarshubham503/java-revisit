package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code3 {
public static  int main(String[] args) {
	int num=56895;
	int n1=0,n2=0;
	while (num!=0) {
		n1=num%10;
		if((n1%2)==0)
			n2+=n1*n1;
		num/=10;
		
	}return n2;
}

}
