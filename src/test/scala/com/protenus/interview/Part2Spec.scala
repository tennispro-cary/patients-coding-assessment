package com.protenus.interview

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Part2Spec extends UnitSpec {
  private val part2 = new Part2()

  // John smith is not the real answer

  "Part 2" should "find names in articles" in {
    part2.findPatients should contain("John Smith")
  }

}
