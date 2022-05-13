//A format for expressing an ordered list of integers is to use a comma separated list of either
//
//individual integers
//or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'.
// The range includes all integers in the interval including both endpoints.
// It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
//Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.
package com.codewars.module_1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task12 {

  public static void main(String[] args) {
    int[] array = {-3, -2, -1, 2, 10, 15, 16, 18, 19, 20};

//    List<Integer> list = Arrays.stream(array)
//            .boxed()
//            .collect(Collectors.toList());
   /* boolean isNextNeighbor = false;
    int countNeighbors = 0;
    boolean isRange = false;

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] == array[i + 1] + 1) {
        isNextNeighbor = true;
        countNeighbors++;
      } else {
        isNextNeighbor = false;
        countNeighbors = 0;
      }
      if (countNeighbors == 3) {
        isRange = true;
        saveRange(start, end);
      }
    }*/

  }

  public static String rangeExtraction(int[] arr) {
    StringBuilder sb = new StringBuilder();


    return "";
  }

  private static boolean isNextNeighbor(int[] arr, int number) {
    return false;
  }

  @Test
  public void test_BasicTests() {
    assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", Task12.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));

    assertEquals("-3--1,2,10,15,16,18-20", Task12.rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
  }
}


