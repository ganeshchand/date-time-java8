# Java Date and Time with Scala

##Goal: Show how to use Java 8 Date Time API with Scala.

##Version: Java 8 with Scala 2.11.8

####Shortcomings of Java APIs prior to Java 8:
* The existing Java classes (such as java.util.Date and SimpleDateFormatter) 
aren’t thread-safe, leading to potential concurrency issues for users
* Some of the date and time classes also exhibit quite poor API design. 
  For example, years in java.util.Date start at 1900, months start at 1, 
  and days start at 0—not very intuitive.
  

* All classes of the Java 8 Date/Time API are located within the java.time package.
    * LocalDate 
    * LocalTime 
    * LocalDateTime 
    By Default, The above classes use the system clock in the default time zone.

We can change this by providing a time zone or an alternative Clock implementation:

// current (local) time in Los Angeles
LocalTime currentTimeInLosAngeles = LocalTime.now(ZoneId.of("America/Los_Angeles"));
// current time in UTC time zone
LocalTime nowInUtc = LocalTime.now(Clock.systemUTC());


### Resources
* [Java 8 DAte and Time Official doc] (http://www.oracle.com/technetwork/articles/java/jf14-date-time-2125367.html)
* [Java 8 Datetime API Blog] (http://www.mscharhag.com/2014/02/java-8-datetime-api.html)
 