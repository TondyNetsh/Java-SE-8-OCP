package FunctionalProgramming.question20;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Quest20 {
    public static void main(String[] args) {
        List<Integer> l = IntStream.range(1,6)
                .mapToObj(i -> i).collect(Collectors.toList());
        l.forEach(System.out::print);
    }
}

/*
What is the simplest way of rewriting this code?
A. IntStream.range(1, 6);
B. IntStream.range(1, 6)
.forEach(System.out::println);
C. IntStream.range(1, 6)
.mapToObj(1 -> i)
.forEach(System.out::println);
D. None of the above is equivalent.
E. The provided code does not compile.
=============================================================================
B. Both lists and streams have forEach() methods. There is no reason to collect into a list
just to loop through it.

*/