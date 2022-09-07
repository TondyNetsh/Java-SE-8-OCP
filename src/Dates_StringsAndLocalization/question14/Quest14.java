package Dates_StringsAndLocalization.question14;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Quest14 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("US/Eastern");
        LocalDate date = LocalDate.of(2016,3,13);
        LocalTime time1 = LocalTime.of(2,15);
        ZonedDateTime a = ZonedDateTime.of(date,time1,zone);
    }
}
/*
Note that March 13, 2016, is the weekend that we spring forward, and November 6, 2016,
is when we fall back for daylight savings time. Which of the following can fill in the blank
without the code throwing an exception?
A. LocalDate.of(2016, 3, 13)
B. LocalDate.of(2016, 3, 40)
C. LocalDate.of(2016, 11, 6)
D. LocalDate.of(2016, 11, 7)
E. LocalDate.of(2017, 2, 29)
=============================================================================================
B, C. Options A and D are incorrect because the String references do not point to the
same object. Option E is incorrect because a Period format begins with a P and a Duration format begins with PT. They are different types and do not represent the same value
even though they are both a day. Remember that Duration uses hours/minutes/seconds and
Period uses years/months/days for measures. Options B and C are correct because m1, m2,
and s all represent a duration of the same length.

*/