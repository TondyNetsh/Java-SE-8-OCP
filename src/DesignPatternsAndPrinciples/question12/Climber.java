package DesignPatternsAndPrinciples.question12;

interface Climb {
    boolean isTooHigh(int height, int limit);
}
public class Climber {
    public static void main(String[] args) {
        //check((h,l) -> h.toString(), 5);    // x1
    }
    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height,10))     // x2
            System.out.println("too high");
        else System.out.println("ok");
    }
}
