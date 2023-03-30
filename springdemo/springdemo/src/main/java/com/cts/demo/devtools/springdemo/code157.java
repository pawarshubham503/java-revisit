package com.cts.demo.devtools.springdemo;

// check for neon number 
// Input  : 9
// Output : Given number  9 is Neon number

// Explanation : square of 9=9*9=81;
//               sum of digit of square : 8+1=9(which is equal to given number)
public class code157 {

    public static boolean check(int n){
int square=n*n;
int sum=0;
while(square>0){
    int rem=square%10;
    sum=sum+rem;
    square=square/10;

}
if (sum == n){
    return true;
}
else
return false;


    }
 public static void main(String[] args) {
    int n=6;
    System.out.println( "IS it neon number "+check(n));
 }   
}
