package DesignPatternsAndPrinciples.question9;

public class CheetahManager {
    public static CheetahManager cheetahManager;
    private CheetahManager() { }
    public static CheetahManager getCheetahManager() {
        if (cheetahManager == null) {
            cheetahManager = new CheetahManager();
        }
        return cheetahManager;
    }
}
