package com.cts.demo.devtools.springdemo;

import java.time.LocalDateTime;
import java.time.Month;

public class code110 {
    
    public static void main(String[] args) {
        //date time zone

		// Year, month, dayOfMonth, hour, minute, second
        LocalDateTime createownDateTime1=LocalDateTime.of(2018, Month.OCTOBER, 22, 12, 9, 22);
        System.out.println( "createowndatetime1 :" +createownDateTime1 );
        

        // Create own LocalDateTime from STRING using parse method
        String dateString="2018-10-22T12:09:22";
        LocalDateTime createownDateTime2 =LocalDateTime.parse(dateString);

        System.out.println("createowndtetime2   " +createownDateTime2);

        
		// **************************************************************** 2) Create own LocalDateTime from STRING using parse method

        // Create own LocalDateTime from STRING
		// Define date in string
        String str1 = "2018-10-22 12:30:22";
        

    }
}
