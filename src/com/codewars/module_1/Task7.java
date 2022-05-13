package com.codewars.module_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task7 {
  public static void main(String[] args) {
    String strng = "56 65 74 100 99 68 86 180 90";

    strng = strng.strip();
    Arrays.stream(strng.split(" "))
            .sorted(Comparator.comparingInt(Task7::sumDigits).thenComparing(String::valueOf))
            .forEach(System.out::println);
  }

  public static String orderWeight(String strng) {
    strng = strng.strip();
    String[] s = strng.split(" ");

    return Arrays.stream(s)
            .sorted(Comparator.comparing((String e) -> {
              int res = 0;
              for (int i = 0; i < e.length(); i++) {
                res += e.charAt(i) - '0';
              }
              return res;
            }).thenComparing(String::valueOf))
            .collect(Collectors.joining(" "));
  }

  private static int sumDigits(String s) {
    return s.chars()
            .map(Character::getNumericValue)
            .sum();
  }
}
