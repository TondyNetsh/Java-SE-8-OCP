package ExceptionsAndAssertions.question6;

import java.io.Closeable;

public class AutoCloseableFlow {
    static class Door implements AutoCloseable {
        public void close() {
            System.out.print("D");
        }
    }
    static class Window implements Closeable {
        public void close() {
            System.out.print("W");
            throw new RuntimeException();
        }
    }
    public static void main(String[] args) {
//        try {
//            Door d = new Door();
//            Window w = new Window();
//        }
//        {
//            System.out.println("T");
//        } catch (Exception e) {
//            System.out.print("E");
//        } finally {
//            System.out.print("F");
//        }
    }
}
/*
What is the output of the following code?
A. TWF
B. TWDF
C. TWDEF
D. TWF followed by an exception
E. TWDF followed by an exception
F. TWEF followed by an exception
G. The code does not compile.
================================================================================================
G. A try-with-resources statement uses parentheses rather than brackets for the try section.
This is likely subtler than a question that you’ll get on the exam, but it is still important to
be on alert for details.
 */
