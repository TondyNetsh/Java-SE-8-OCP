package FunctionalProgramming.question9;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class Quest9 {
    public static void main(String[] args) {
        LongStream ls = LongStream.of(1,2,3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
    }
}

/*
Which of the following can we add after line 5 for the code to run without error and not
produce any output? (Choose all that apply.)
A. if (opt.isPresent()) System.out.println(opt.get());
B. if (opt.isPresent()) System.out.println(opt.getAsLong());
C. opt.ifPresent(System.out.println)
D. opt.ifPresent(System.out::println)
E. None of these; the code does not compile.
F. None of these; line 5 throws an exception at runtime.
============================================================================================
B, D. Option A would work for a regular Stream. However, we have a LongStream and
therefore need to call getAsLong(). Option C is missing the :: that would make it a
method reference. Therefore, options B and D are correct.
 */