package AdvancedClassDesign.question16;

public class Outer {
    class Inner{}

    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.hashCode();
    }
}
