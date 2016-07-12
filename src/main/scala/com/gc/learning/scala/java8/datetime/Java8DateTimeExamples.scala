package com.gc.learning.scala.java8.datetime

/**
  * Created by ganeshchand on 7/11/16.
  */


import java.time._
import java.util.TimeZone
object Java8DateTimeExamples extends App{
  val today = LocalDate.now()
  println(s"Today's Date is: $today")

  val now = LocalDateTime.now()
  println(s"Today's DateTime is: $now")

  println(s"Today is: ${today.getDayOfWeek}")
  println(s"Time now is: ${now.getHour}:${now.getMinute}: ${now.getSecond}")




  // By default, LocalDate & LocalTime will use the system clock in the default time zone
  // This default behaviour cah be changed by providing a timezone

  val currentTimeInSanFrancisco = LocalTime.now(ZoneId.of("America/Los_Angeles"))
  println(s"Current Time in San Francisco $currentTimeInSanFrancisco")

  val allSupportedTimeZoneIDs = TimeZone.getAvailableIDs()

  val  americaTimeZoneIds = allSupportedTimeZoneIDs.toList.filter(_.toLowerCase.contains("america"))

  // We can also get alternate clock time

  // current time in UTC time zone

  val nowInUtc = LocalTime.now(Clock.systemUTC())



}
