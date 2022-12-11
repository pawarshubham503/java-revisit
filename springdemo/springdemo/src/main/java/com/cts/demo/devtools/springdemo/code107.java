package com.cts.demo.devtools.springdemo;

import java.util.OptionalInt;

public class code107 {
    
    public static void main(String[] args) {
        OptionalInt optionalInt=OptionalInt.of(5);

        //isPresent() will return true - If a value is present
        System.out.println("1 . optional is present : " + optionalInt.isPresent());

        

    }
}
