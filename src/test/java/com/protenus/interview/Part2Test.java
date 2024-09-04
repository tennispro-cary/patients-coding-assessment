package com.protenus.interview;

import org.junit.Test;
import static org.junit.Assert.*;
public class Part2Test {

  Part2J part2 = new Part2J();

  @Test
  public void testA() {
    assertTrue(part2.partA().contains("John Smith"));
  }

}
