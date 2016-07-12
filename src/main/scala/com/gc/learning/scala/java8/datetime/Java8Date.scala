package com.gc.learning.scala.java8.datetime

/**
  * Created by ganeshchand on 7/11/16.
  */


import java.time.{LocalDate, LocalDateTime}
object Java8Date extends App{
  val today = LocalDate.now()
  println(s"Today's Date is: $today")

  val now = LocalDateTime.now()
  println("Today's DateTime is: "+now)

  println(s"Today is: ${today.getDayOfWeek}")
  println(s"Time now is: ${now.getHour}:${now.getMinute}: ${now.getSecond}")

}
