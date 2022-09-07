package FunctionalProgramming.question10;

import java.util.stream.Stream;

public class Quest10 {
    public static void main(String[] args) {
//        Stream.generate(() -> "1")
//                .filter(x -> x.length() > 1)
//                .forEach(System.out::println)
//                .limit(10)
//                .peek(System.out::println);
    }
}

/*
Select from the following statements and indicate the order in which they would appear to
output 10 lines:
A. L, N
B. L, N, O
C. L, N, M
D. L, N, M, O
E. L, O, M
F. N, M
G. N, O
==========================================================================================
F. The terminal operation must be right before the semicolon, which is line M. Remember
that forEach() is a terminal operation while peek() is an intermediate operation. This
eliminates all but choices C, E, and F. Choice E is incorrect because there is no limit()
operation, which means that the code would run infinitely. Choice C is incorrect because
filter() is called before limit(). No elements make it through the filter, so the code also
runs infinitely. Choice F is correct.
 */