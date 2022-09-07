package FunctionalProgramming.question17;

import java.util.function.UnaryOperator;

public class Quest17 {
    public static void main(String[] args) {
        UnaryOperator<Integer> u = x -> x * x;
    }
}

/*
Which of the following is equivalent to this code?
A. BiFunction<Integer> f = x -> x*x;
B. BiFunction<Integer, Integer> f = x -> x*x;
C. BinaryOperator<Integer, Integer> f = x -> x*x;
D. Function<Integer> f = x -> x*x;
E. Function<Integer, Integer> f = x -> x*x;
F. None of the above
==========================================================================
E. A UnaryOperator is a special type of function where the parameter and return type
are the same. Therefore, option E is correct. Notice that other options don’t even compile
because they have the wrong number of generic types for the functional interface provided.

*/