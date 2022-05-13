//Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
// which is the number of times you must multiply the digits in num until you reach a single digit.
package com.codewars.module_1;

public class Task5 {
  public static void main(String[] args) {

    long n = 27;
    int c = 0;
    while (n >= 10) {
      n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
      c++;
    }
    System.out.println();
    System.out.println(c);
  }

  public static int persistence(long n) {
    // your code
    int c = 0;
    while (n > 9) {
      n = persist(n);
      c++;
    }
    return c;
  }

  private static long persist(long n) {
    long result = 1;
    for (int i = 0; i < String.valueOf(n).length(); i++) {
      int num = Integer.parseInt(String.valueOf(n), i, i + 1, 10);
      result *= num;
    }

    return result;
  }
}
