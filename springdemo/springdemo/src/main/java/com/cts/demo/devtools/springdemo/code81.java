package com.cts.demo.devtools.springdemo;

public class code81 {
 //code to print smallest and largest number in array
 
 public static void main(String[] args) {
    int arr[]=new int[]{12,56,76,89,100,343,21,234};

    int smallest=arr[0];
    int largest=arr[0];

    for (int i=0;i<arr.length;i++){
        if(arr[i]>largest)
        largest=arr[i];
        else if(arr[i]<smallest)
        smallest=arr[i];
    }
    System.out.println("smallest " + smallest +"largest "+ largest);
}
 }