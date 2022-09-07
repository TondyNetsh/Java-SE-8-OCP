package Dates_StringsAndLocalization.question10;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Quest10 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2015,5,10,11,22,33);
        Period p = Period.of(1,2,3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
    }
}
/*
What is the output of the following code?
A. 3/7/14 11:22 AM
B. 5/10/15 11:22 AM
C. 3/7/14
D. 5/10/15
E. 11:22 AM
F. The code does not compile.
G. A runtime exception is thrown.
================================================================================
E. Even though d has both date and time, the formatter only outputs time.
 */