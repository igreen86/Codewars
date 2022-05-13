//Your task is to sort a given string. Each word in the string will contain a single number. This number is the position
// the word should have in the result.
//
//Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
package com.codewars.module_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task6 {
  public static void main(String[] args) {
    String words = "is2 Thi1s T4est 3a";
    String[] s = words.split(" ");
    Arrays.stream(s)
            .sorted(Comparator.comparing(e -> e.replaceAll("\\D", "")))
            .forEach(System.out::println);

  }

  public static String order(String words) {
    String[] s = words.split(" ");
    return Arrays.stream(s)
            .sorted(Comparator.comparing(e -> e.replaceAll("[a-zA-Z]", "")))
            .collect(Collectors.joining(" "));
  }
}
