package com.cts.demo.devtools.springdemo;



public class code150 {

    public static void main(String[] args) {

System.out.println(checknumber(14));

    }

    
    public static boolean checknumber(int n){
        if(n== 0){
            return true;
        }

        else{
            int val1=(5*n*n)-4;
            int sq1=(int )Math.sqrt(val1);
            if(sq1*sq1==val1){
                return true;
            }
            else{
                int val2=(5*n*n)+4;
                int sq2=(int)Math.sqrt(val2);
                return(sq2*sq2==val2);
            }
        }
    }
    
}
