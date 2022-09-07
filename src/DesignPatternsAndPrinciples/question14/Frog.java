package DesignPatternsAndPrinciples.question14;

interface CanHop {}
public class Frog implements CanHop {
    public static void main(String[] args) {
        Frog frog = new TurtleFrog();
    }
}
class BrazialianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}

//A. Frog
//B. TurtleFrog
//C. BrazilianHornedFrog
//D. CanHop
//E. Object
//F. Long
//========================================================================
//A, B, D, E. The blank can be filled with any class or interface that is a supertype of TurtleFrog.
//A is a superclass of TurtleFrog, and B is the same class, so both are correct.
//BrazilianHornedFrog is not a superclass of TurtleFrog, so C is incorrect. TurtleFrog
//inherits the CanHop interface, so D is correct. All classes inherit Object, so E is correct.
//Finally, Long is an unrelated class that is not a superclass of TurtleFrog, and it is therefore
//incorrect.