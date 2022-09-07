package ExceptionsAndAssertions.question3;

import java.io.IOException;

public class Quest3 {
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException io) { }
    }
}
/*
Which of the following fills in the blank to make the code compile? (Choose all that apply)
A. FileNotFoundException | IOException e
B. FileNotFoundException e | IOException e
C. FileNotFoundException | RuntimeException e
D. FileNotFoundException e | RuntimeException e
E. IOException | RuntimeException e
F. IOException e | RuntimeException e
===========================================================================================
E. Options B, D, and F are incorrect because only one variable name is allowed in a
multi-catch block. Option A is incorrect because FileNotFoundException is a subclass
of IOException. A multi-catch statement does not allow redundancy, and just catching
IOException would have been equivalent. Option C is incorrect because the IOException
that is thrown is not handled.
 */