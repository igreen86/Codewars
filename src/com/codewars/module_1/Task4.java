//The goal of this exercise is to convert a string to a new string where each character in the new string is "("
// if that character appears only once in the original string, or ")" if that character appears more than once in the
// original string. Ignore capitalization when determining if a character is a duplicate.
package com.codewars.module_1;

import java.util.Locale;

public class Task4 {
  public static void main(String[] args) {
    String s = "aAabzz";
    s.
            toLowerCase(Locale.ROOT)
            .chars()
            .mapToObj(i -> String.valueOf((char) i))
            .map(i -> s.indexOf(i) == s.lastIndexOf(i) ? "(" : ")")
            .forEach(System.out::println);
  }

  static String encode(String word) {
    word = word.toLowerCase(Locale.ROOT);
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
      if (isDuplicated(word.charAt(i), word)) {
        result.append(")");
      } else {
        result.append("(");
      }

    }
    return result.toString();
  }

  private static boolean isDuplicated(char ch, String word) {
    int c = 0;
    for (int i = 0; i < word.length(); i++) {
      if (ch == word.charAt(i)) {
        c++;
      }
    }
    return c > 1;
  }
}
