package com.protenus.interview

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Part1Spec extends UnitSpec {

  behavior of "Part 1"

  private val part1 = new Part1()

  // these are not the real answers! this just demonstrates use of assertions

  it should "count patients with zero medical problems" in {
    assertResult(5)(part1.partA)
  }

  it should "find who has the most medical problems" in {
    assertResult("John Smith")(part1.partB)
  }

  it should "count patients who have zero prescriptions" in {
    assertResult(10)(part1.partC)
  }

}
