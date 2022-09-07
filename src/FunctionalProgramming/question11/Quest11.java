package FunctionalProgramming.question11;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quest11 {
    public static void main(String[] args) {
        System.out.println(Stream.iterate(1,x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));
    }
}

/*
What changes need to be made for this code to print the string 12345? (Choose all that
apply.)
A. Change Collectors.joining() to Collectors.joining("").
B. Change map(x -> x) to map(x -> "" + x) .
C. Change x -> x++ to x -> ++x.
D. Add forEach(System.out::print) after the call to collect().
E. Wrap the entire line in a System.out.print statement.
F. None of the above. The code already prints 12345.
===========================================================================================
B, C, E. As written, the code doesn’t compile because the collector expects to get a String
immediately before it in the chain. Option B fixes this, at which point nothing is output
because the collector creates a String. Option E fixes this and causes the output to be
11111. Since the post-increment operator is used, the stream contains an infinite number of
1s. Option C fixes this and causes the stream to contain increasing numbers.
 */