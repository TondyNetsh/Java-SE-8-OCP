package ExceptionsAndAssertions.question1;

import java.sql.SQLException;

public class Quest1 {
    public void read() throws SQLException {
        throw new SQLException();
    }
}
/*
Which of the following pairs fills in the blanks to make this code compile?
A. throw on line 5 and throw on line 6
B. throw on line 5 and throws on line 6
C. throws on line 5 and throw on line 6
D. throws on line 5 and throws on line 6
E. None of the above. SQLException is a checked exception and cannot be thrown.
F. None of the above. SQLException is a runtime exception and cannot be thrown.
===============================================================================
C. The method should declare that it throws an exception and the body of the method
actually would throw it. Options E and F are incorrect because both checked and
unchecked (runtime) exceptions can be declared in a method signature. Also, option F is
incorrect because SQLException is a checked exception.
 */