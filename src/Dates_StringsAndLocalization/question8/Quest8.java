package Dates_StringsAndLocalization.question8;

import java.time.LocalDate;
import java.time.Month;

public class Quest8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL,30);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
/*
What is the output of the following code?
A. 2018 APRIL 2
B. 2018 APRIL 30
C. 2018 MAY 2
D. The code does not compile.
E. A runtime exception is thrown.

=======================================================================================
F. Java throws an exception if invalid date values are passed. There is no 40th day in
April—or any other month for that matter.

*/