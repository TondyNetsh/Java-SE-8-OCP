package FunctionalProgramming.question1;

import java.util.stream.Stream;

public class Quest1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("",(s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }
}
