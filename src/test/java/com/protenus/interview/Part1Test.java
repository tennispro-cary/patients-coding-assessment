package com.protenus.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Part1Test {

  Part1J part1 = new Part1J();

  // these are not the real answers! this just demonstrates use of assertions

  @Test
  public void partA() {
    assertEquals(5, part1.partA());
  }

  @Test
  public void partB() {
    assertEquals("John Smith", part1.partB());
  }

  @Test
  public void partC() {
    assertEquals(10, part1.partC());
  }
}
