//A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
// the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
// because it uses the letters A-Z at least once (case is irrelevant).
package com.codewars.module_1;


import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Task3 {
    private static final int LETTERS_IN_ENGLISH_ALPHABET = 26;
  public static void main(String[] args) {
    String sentence = "The quick brown fox jumps over the lazy dog";
    System.out.println(
            sentence.chars()
                    .filter(Character::isAlphabetic)
                    .map(Character::toLowerCase)
                    .distinct()
                    .count() == LETTERS_IN_ENGLISH_ALPHABET);
  }


  public boolean check(String sentence) {
    //code
    sentence = sentence.toLowerCase(Locale.ROOT);
    sentence = sentence.replaceAll("[^\\p{L}\\p{Space}]",
            "");
    sentence = sentence.replace(" ",
            "");

    Set<Integer> asciiCodes = new HashSet<>();
    for (int i = 0; i < sentence.length(); i++) {
      asciiCodes.add((int) sentence.charAt(i));
    }

    // there are 26 letters in English alphabet
    return asciiCodes.size() == LETTERS_IN_ENGLISH_ALPHABET;
  }
}
