package AdvancedClassDesign.question19;

public class LearnToWalk {
    public void toddle() {}
    class BabyRhino extends LearnToWalk {
        //public void toddle() { }

        public final void toddle() { }
    }
}

/*
A, C. An override must have the same method signature. A and C both do. F is an overload
because it has a different parameter list. E does not compile because it throws a checked
exception not declared in the superclass. D compiles but is not an override because it is
static. B has a different method name, so it is not even an overload.
*/