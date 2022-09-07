package Dates_StringsAndLocalization.question15;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Quest15 {
    public static void main(String[] args) {
        String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
        String m2 = Duration.ofMinutes(1).toString();
        String s = Duration.of(60,ChronoUnit.SECONDS).toString();

        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(s));
    }
}
/*
Given the following code, which of the answer choices can fill in the blank to print true?
(Choose all that apply.)
A. m1 == m2
B. m1.equals(m2)
C. m1.equals(s)
D. d == p
E. d.equals(p)
============================================================================================
A, B, F. Option A correctly creates the current instant. Option B correctly converts from
seconds to an Instant. Option F is also a proper conversion. Options C, D, and E are
incorrect because the source object does not represent a point in time. Without a time zone,
Java doesn’t know what moment in time to use for the Instant.
 */