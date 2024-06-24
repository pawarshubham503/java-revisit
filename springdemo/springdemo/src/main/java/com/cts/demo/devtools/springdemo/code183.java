package com.cts.demo.devtools.springdemo;

//Largest number in Array
public class code183 {

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9};
        int max=num[0];
     for( int i=0 ; i< num.length;i++){
        if (num[i]>max){
            System.out.println("at index max value is : " +i);
            max=num[i];
            int k =i;
            
        }
     }
     System.out.println(max);

        }
    }
