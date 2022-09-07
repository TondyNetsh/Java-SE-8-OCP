package GenericsAndCollections.question12;

public class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }
    public static void main(String[] args) {

    }
}

//A. Helper.printException(new FileNotFoundException("A"));
//B. Helper.printException(new Exception("B"));
//C. Helper.<Throwable>printException(new Exception("C"));
//D. Helper.<NullPointerException>printException(new NullPointerException
//("D"));
//E. Helper.printException(new Throwable("E"));

//==================================================================================================

/* A, B, D. The generic type must be Exception or a subclass of Exception since this is an
upper bound. C and E are wrong because Throwable is a superclass of Exception. D uses
an odd syntax by explicitly listing the type, but you should be able to recognize it as acceptable.
*/