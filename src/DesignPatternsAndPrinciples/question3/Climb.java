package DesignPatternsAndPrinciples.question3;

public interface Climb {
    public int climb();
}
abstract class Swim {
    public abstract Object swim(double speed, int duration);
}
interface ArcticMountain extends MountainClimb {
    public default int getSpeed() {
        return 0;
    }
}
interface MountainClimb extends Climb { }

//A. Climb
//B. Swim
//C. ArcticMountainClimb
//D. MountainClimb
//E. None of these are valid functional interfaces.
//===========================================================================================
//A, D. A is correct as Climb defines an interface with exactly one abstract method. B is
//incorrect, as abstract classes are not functional interfaces despite having a single abstract
//method. While functional interfaces may have any number of default methods, ArcticMountainClimb
// will not compile due to the default method getSpeed() missing an
//implementation body, so C is incorrect. D is correct, as the interface MountainClimb has
//exactly one abstract method defined in Climb. Finally, E is incorrect because A and D are
//correct.
