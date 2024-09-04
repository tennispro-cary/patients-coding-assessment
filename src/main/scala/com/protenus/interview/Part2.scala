package com.protenus.interview

import java.net.URL

object Part2 {

  val ArticleFiles: List[URL] = (1 to 14).map(name => getClass.getResource(s"/articles/$name.html")).toList

}

class Part2 {

  def findPatients: List[String] = {
    println("starting part 2")
    List("John Smith", "John Doe")
  }

}
