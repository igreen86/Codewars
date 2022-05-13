package test;

import com.codewars.module_1.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {
  @Test
  void solutionTestWith10ShouldReturn23() {
    Task1 task1 = new Task1();
    Assertions.assertEquals(23, task1.solution(10));
  }
}
