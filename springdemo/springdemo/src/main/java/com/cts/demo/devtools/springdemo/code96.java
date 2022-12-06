package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class code96 {
    
   // CreateStreamFilterDisplaySorting

   public static void main(String[] args) {
    
    List<String> stringList =new ArrayList <>();
    stringList.add("ank");
    stringList.add("sam");
    stringList.add("az");
    stringList.add("neh");
    stringList.add("ad");
    

    Stream<String> stream=stringList.stream();

    // In one line display all records that start with 'a' in stream
    System.out.println("1. Use stream for filtering and display:");

    stream.filter(s->s.startsWith("a")).forEach(System.out::println);
   
    // In one line display all record (in sorted manner - ASCENDING) that starts with "a" in the stream
    stream = stringList.stream();
    System.out.println("4. Use stream for filtering, sorting and display (in sorted manner - ASCENDING Order):");
      stream.filter(s->s.startsWith("a")).sorted().forEach(System.out::println);

      
		// In one line display all record (in sorted manner - DESCENDING) - by passing lambda expression that starts with "a" in the stream
		stream = stringList.stream();
		System.out.println("5. Use stream for filtering, sorting and display (in sorted manner - DESCENDING Order):");
      stream.filter(s->s.startsWith("a")).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
      
      
      // In one line display all record (in sorted manner - DESCENDING) - using Comparator.reverseOrder() that starts with "a" in the stream
		stream = stringList.stream();
		System.out.println("6. Use stream for filtering, sorting and display (in sorted manner - DESCENDING Order):");
      stream.filter(s->s.startsWith("a")).sorted(Comparator.reverseOrder()).forEach(System.out::println);


      // In one line display all record (in sorted manner) in UPPERCASE that starts with 'a' in the stream

      stream = stringList.stream();
		System.out.println("7.Use stream for filtering, UPPERCASE conversion, sorting and display:");
      stream.filter(s->s.startsWith("a")).map(s->s.toUpperCase()).sorted().forEach(System.out::println);
  
  
  
  
  
  
   }
    
}
