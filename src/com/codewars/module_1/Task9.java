//You will be given a number and you will need to return it as a string in Expanded Form.

package com.codewars.module_1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task9 {
  public static void main(String[] args) {
    int num = 70304;
//    int num = 12;
    System.out.println(expandedForm(num));

  }

  public static String expandedForm(int num) {
     return IntStream.range(0, String.valueOf(num).length())
            .mapToObj(x -> String.valueOf( Character.getNumericValue(String.valueOf(num).charAt(x) )
              * (int)Math.pow(10, String.valueOf(num).substring(x).length()-1)))
//            .forEach(System.out::println);
            .filter(x -> !x.equals("0"))
            .collect(Collectors.joining(" + "));
//    return null;



    /* IntStream.range(0, String.valueOf(num).length())
            .mapToObj(i -> {
              String s = String.valueOf(i);
              int len = s.length();
              StringBuilder sb = new StringBuilder();
//              for (int j = 0; j < len; j++) {
//                if (s.charAt(j) != '0') {
//                  sb.append((s.charAt(j) - '0') * (int)Math.pow(10, (len - 1 - j)));
//
//                }
//                if (j < len - 1 && s.charAt(j) != '0') {
//                  sb.append(" + ");
//                }
//              }
              sb.append((s.charAt(i) - '0') * (int)Math.pow(10, (len - 1 - i)));
              s = sb.toString();

              return s;
            })
             .forEach(System.out::println);
//            .collect(Collectors.joining());
    return null;*/
  }
}
