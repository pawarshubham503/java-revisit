package com.cts.demo.devtools.springdemo;
//LCm of number



public class code155 {
    public static int gcd(int u,int v){
        if(u==0){
            return v;
        }
        return gcd(v%u,u);
    }
    public static int lcm(int u,int v){
        return(u/ gcd(u,v))*v;
    }

    public static void main(String[] args) {
        int u=25; int v=15;
        System.out.println(lcm(u, v));
    }


}
