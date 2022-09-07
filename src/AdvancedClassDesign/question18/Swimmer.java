package AdvancedClassDesign.question18;

public class Swimmer {
    enum AnimalClasses {
        MAMMAL {
            @Override
            public boolean hasFins() {
                return false;
            }
        }, FISH {
            public boolean hasFins() { return true; }},
        BIRD {
            @Override
            public boolean hasFins() {
                return false;
            }
        }, REPTILE {
            @Override
            public boolean hasFins() {
                return false;
            }
        }, AMPHIBIAN {
            @Override
            public boolean hasFins() {
                return false;
            }
        }, INVERTEBRATE {
            @Override
            public boolean hasFins() {
                return false;
            }
        };
        public abstract boolean hasFins();
    }

    public static void main(String[] args) {
        System.out.println(AnimalClasses.FISH);
        System.out.println(AnimalClasses.FISH.ordinal());
        System.out.println(AnimalClasses.FISH.hasFins());
        System.out.println(AnimalClasses.BIRD.hasFins());
    }
}
