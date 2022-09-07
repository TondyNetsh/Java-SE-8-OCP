package DesignPatternsAndPrinciples.question11;

public interface Secret {
    String magic(double d);
}
class MySecret implements Secret {
    public String magic(double d) {
        return "Poof";
    }
}

//A. caller((e) -> "Poof");
//B. caller((e) -> {"Poof"});
//C. caller((e) -> { String e = ""; "Poof" });
//D. caller((e) -> { String e = ""; return "Poof"; });
//E. caller((e) -> { String e = ""; return "Poof" });
//F. caller((e) -> { String f = ""; return "Poof"; });

//===============================================================================================

//A, F. B is incorrect because it does not use the return keyword. C, D, and E are incorrect
//because the variable e is already in use from the lambda and cannot be redefined. Additionally,
//C is missing the return keyword and E is missing the semicolon. A and F are the only
//correct lambda expressions that match the functional interface.