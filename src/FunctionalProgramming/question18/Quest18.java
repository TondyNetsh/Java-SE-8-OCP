package FunctionalProgramming.question18;

import java.util.stream.DoubleStream;

public class Quest18 {
    public static void main(String[] args) {
        DoubleStream s = DoubleStream.of(1.2,2.4);
        s.peek(System.out::println).filter(x -> x > 2).count();
    }
}

/*
What is the result of the following?
A. 1
B. 2
C. 2.4
D. 1.2 and 2.4
E. There is no output.
F. The code does not compile.
G. An exception is thrown.
===============================================================================
D. The terminal operation is count(). Since there is a terminal operation, the intermediate
operations run. The peek() operation comes before the filter, so both numbers are printed.
The count happens to be 1 since the other number is filtered. However, the result of the
stream pipeline isn’t stored in a variable, and that result is ignored.

*/