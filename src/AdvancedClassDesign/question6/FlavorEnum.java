package AdvancedClassDesign.question6;

public class FlavorEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    public static void main(String[] args) {
        System.out.println(Flavors.CHOCOLATE.ordinal());
    }
}
