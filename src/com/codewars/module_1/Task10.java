//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
// The array is either entirely comprised of odd integers or entirely comprised of even integers
// except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

package com.codewars.module_1;

import java.util.Arrays;

public class Task10 {
  static int find(int[] integers) {
    if (isOdd(integers)) {
      return Arrays.stream(integers)
              .parallel()
              .filter(i -> i % 2 == 0)
              .findFirst()
              .getAsInt();
    } else {
      return Arrays.stream(integers)
              .parallel()
              .filter(i -> i % 2 != 0)
              .findFirst()
              .getAsInt();
    }
  }

  private static boolean isOdd(int[] ints) {
    return Arrays.stream(ints)
            .limit(3)
            .filter(i -> i % 2 != 0)
            .count() > 1;

  }
}
