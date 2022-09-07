package FunctionalProgramming.question2;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Quest2 {
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(() -> "growl! ");
        Stream<String> stream2 = Stream.generate(() -> "growl! ");
        boolean b1 = stream1.anyMatch(predicate);
        boolean b2 = stream2.allMatch(predicate);
        System.out.println(b1 + " " + b2);
    }
}
/*
A. true false
B. true true
C. java.util.stream.ReferencePipeline$3@4517d9a3
D. The code does not compile.
E. An exception is thrown.
F. The code hangs.
============================================================================
F. b1 is set to true since anyMatch() terminates. Even though the stream is infinite, Java
finds a match on the first element and stops looking. However, when allMatch() runs,
it needs to keep going until the end of the stream since it keeps finding matches. Since all
elements continue to match, the program hangs.
 */