//In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
package com.codewars.module_1;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
  public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out
    return list.stream()
            .filter(Integer.class::isInstance)
            .collect(Collectors.toList());

  }
}
