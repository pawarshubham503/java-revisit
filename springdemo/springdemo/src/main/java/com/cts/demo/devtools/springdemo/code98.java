package com.cts.demo.devtools.springdemo;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class code98 {
    //java 8 reduce method
public static void main(String[] args) {
    List<String> words = Arrays.asList("GFG", "Geeks", "for",
    "GeeksQuiz", "GeeksforGeeks");
    Optional<String> longestString =words.stream().reduce((word1,word2)->word1.length() > word2.length() ? word1:word2);

    longestString.ifPresent(System.out::println);
}
   
    


}
