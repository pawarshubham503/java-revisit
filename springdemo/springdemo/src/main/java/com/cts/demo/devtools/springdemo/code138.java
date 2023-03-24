package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code138 {
    /**
     * @param args
     */
    public static void main(String[] args) {
      
        
        Scanner sc= new Scanner(System.in);
        int basicS=sc.nextInt(); 
        int grade=sc.next().charAt(0);  
        double totalS=basicS+(double)(0.2*basicS)+(double)(0.5*basicS)-(double)(0.11*basicS);

        if (grade==65){
            totalS=totalS+1700;
        }
        else if(grade==66){
            totalS=totalS+1500;
        }
        else{
            totalS=totalS+1300;
        }

        System.out.println(Math.round(totalS));
    }
    
}
