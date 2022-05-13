//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//        Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative,
//        return 0 (for languages that do have them).
//
//        Note: If the number is a multiple of both 3 and 5, only count it once.

package com.codewars.module_1;

import java.util.stream.IntStream;

public class Task1 {
  public static void main(String[] args) {
    Task1 task1 = new Task1();
    System.out.println("result = " + task1.solution(10));
  }

  public int solution(int number) {
    return IntStream
            .range(3, number)
            .filter(i -> i % 3 == 0 || i % 5 == 0)
            .sum();
  }

  private int solve(int number) {
    if (number < 0) {
      return 0;
    }
    int result = 0;
    for (int i = 3; i < number; i++) {
      if (isMultiplierOfThreeOrFive(i)) {
        result += i;
      }
    }
    return result;
  }

  private static boolean isMultiplierOfThreeOrFive(int num) {
    return num % 3 == 0 || num % 5 == 0;
  }


}
