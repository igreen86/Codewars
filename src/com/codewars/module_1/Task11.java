//Some numbers have funny properties. For example:
//
//89 --> 8¹ + 9² = 89 * 1
//
//695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
//
//46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
//
//Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
//
//we want to find a positive integer k, if it exists, such as the sum of the digits of n taken to the successive powers of p is equal to k * n.
//In other words:
//
//Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
//
//If it is the case we will return k, if not return -1.
//
//Note: n and p will always be given as strictly positive integers.

package com.codewars.module_1;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task11 {
  public static void main(String[] args) {
    digPow(46288, 3);
  }

  public static long digPow(int n, int p) {
    AtomicInteger runCount = new AtomicInteger(0);
    long sum = IntStream.range(0, String.valueOf(n).length())
            .mapToObj(i -> digitValueOfNumberAt(n, i))
            .mapToLong(el -> (long) Math.pow(el, p + runCount.getAndIncrement()))
            .reduce(0L, Long::sum);

    if (sum % n == 0) {
      return sum / n;
    } else {
      return -1;
    }
  }


  private static int digitValueOfNumberAt(int n, int idx) {
    return String.valueOf(n).charAt(idx) - '0';

  }

  @Test
  public void test3() {
    assertEquals(51, Task11.digPow(46288, 3));
  }
  @Test
  public void test1() {
    assertEquals(1, Task11.digPow(89, 1));
  }
  @Test
  public void test2() {
    assertEquals(-1, Task11.digPow(92, 1));
  }
}
