package DesignPatternsAndPrinciples.question20;

public interface CanFly {
    void fly();
}
interface HasWings {
    public abstract Object getWingSpan();
}
abstract class Falcon implements CanFly, HasWings {
}
