//You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even
// numbers at their original positions.

package com.codewars.module_1;

import java.util.Arrays;
import java.util.Iterator;

public class Task8 {
  public static void main(String[] args) {
    int[] array = {5, 8, 6, 3, 4};
    array = sortArray(array);
    System.out.println(Arrays.toString(array));


  }

  public static int[] sortArray(int[] array) {
    Iterator<Integer> sortedOdds = Arrays.stream(array)
            .boxed()
            .filter(Task8::isOdd)
            .sorted()
            .iterator();


    return Arrays.stream(array)
            .map(e -> isOdd(e) ? sortedOdds.next() : e)
            .toArray();
  }

  private static boolean isOdd(Integer integer) {
    return integer % 2 != 0;
  }
}
