package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.List;

public class code91 {

    //java 8 ConvertArraylistinStream
   public static void main(String[] args) {
    List<String> stringList=new ArrayList<>();
    stringList.add("nitin");
    stringList.add("sachin");
    stringList.add("anoop");
    stringList.add("ajay");

    //display record that start with a in stringlist

    System.out.println("1 , used stream for filtering and display :");
    stringList.stream().filter(s-> s.startsWith("a")).forEach(System.out::println);   
    System.out.println("***********");


    //display all record in sorted manor ascending that starts with a
    System.out.println("2. Used stream for filtering, sorting and display in ascending order: ");
    stringList.stream().filter(s->s.startsWith("a")).sorted().forEach(System.out::println);
    System.out.println("***********");

    
	// display all record in sorted manner (descending) that starts with 'a' in stringList
	System.out.println("3. Used stream for filtering, sorting and display in descending order: ");
    stringList.stream().filter(s->s.startsWith("a")).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
    System.out.println("***********");


    // display all record in upper case that starts with 'a' in stringList
    System.out.println("4. Used stream for filtering, uppercase, sorting and display: ");
    stringList.stream().filter(s->s.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
    System.out.println("***********");

    // In one line check whether any record starts with 'a' in stringList
    boolean anyRecordStartsWithA=stringList.stream().anyMatch(s->s.startsWith("a"));
    System.out.println("5 . any record starts with a " +anyRecordStartsWithA);
    System.out.println("***********");


    // In one line check whether all record starts with 'a' in stringList
    boolean allRecordsStartsWithA =stringList.stream().allMatch(s->s.startsWith("a"));
    System.out.println("6 . any record starts with :" +allRecordsStartsWithA);
    System.out.println("***********");


    // In one line check whether none of the record starts with 'b' in stringList
    boolean nonestartWithA =stringList.stream().noneMatch(s->s.startsWith("a"));
    System.out.println("7. none starts with A :" + nonestartWithA);
    System.out.println("***********");


    // In one line count records starts with 'a' in stringList
    long countStartWithA =stringList.stream().filter(s->s.startsWith("a")).count();
    System.out.println("8. starts with A count :"+ countStartWithA);

} 
}   
