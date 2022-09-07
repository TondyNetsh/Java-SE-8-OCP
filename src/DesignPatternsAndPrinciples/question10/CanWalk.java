package DesignPatternsAndPrinciples.question10;

public interface CanWalk {
    default void walk() {
        System.out.println("Walking");
    }
}
interface CanRun {
    public default void walk() {
        System.out.println("Walking");
    }
    public abstract void run();
}
interface CanSprint extends CanWalk, CanRun {
    void sprint();
    default void run() {}
    default void walk() {}
}

//A. The code compiles without issue.
//B. The code will not compile because of line 5.
//C. The code will not compile because of line 6.
//D. The code will not compile because of line 8.
//E. The code will not compile because of line 9.

//====================================================================================
//D. While Java supports multiple inheritance through interfaces, it does not support method
//overriding in interfaces, since it’s not clear which parent method should be used. In this
//example, CanWalk and CanRun both implement a default walk() method. The definition of
//CanSprint extends these two interfaces and therefore won’t compile as two default methods with
//the same signature from parent classes are detected, therefore the answer is D. None
//of the other lines of code cause problems, so the rest of the answers are not correct.