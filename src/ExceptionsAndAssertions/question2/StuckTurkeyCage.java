package ExceptionsAndAssertions.question2;

public class StuckTurkeyCage implements AutoCloseable {         // 1
    public void close() throws Exception {                      // 2
        throw new Exception("Cage does not close");             // 3
    }                                                           // 4

    public static void main(String[] args) throws Exception {   // 5
        try(StuckTurkeyCage t = new StuckTurkeyCage()) {        // 6
            System.out.println("put turkeys in");               // 7
        }                                                       // 8
    }                                                           // 9
}                                                               // 10
/*
Which of the following changes when made independently would make this code compile?
(Choose all that apply.)
A. Remove throws Exception from the declaration on line 2.
B. Add throws Exception to the declaration on line 5.
C. Change line 8 to } catch (Exception e) {}.
D. Change line 8 to } finally {}.
E. None of the above will make the code compile.
F. The code already compiles as is.
=====================================================================================
B, C. Option A is incorrect because it will move the compilation error to the close() method
since it does throw an exception that must be handled or declared. Option B is correct
because the unhandled exception becomes declared. Option C is correct because the exception
becomes handled. Option D is incorrect because the exception remains unhandled.
*/