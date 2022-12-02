package com.cts.demo.devtools.springdemo;

import java.util.stream.IntStream;

public class code95 {
    // CountNumberOfRecordsGreaterThan2

    public static void main(String[] args) {
        
        long countrecordsGreaterThan2 =IntStream.of(1,2,3,4,5,6,8,7,4).filter(s-> s>2).count();
        System.out.println("count of record greater thsn 2 is: " + countrecordsGreaterThan2);
    }
}
