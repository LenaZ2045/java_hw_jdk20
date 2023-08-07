package hw_july26;

public class WorldState {
    boolean  isWar = true;
    boolean isCataclysm = true;
    boolean isTheft = true;
    boolean amIAlive = true;
    boolean amIHungry = false;
    boolean anIHomeless = false;
    boolean isEarthCollapsed = false;
    public static boolean isWorldNegativelyGood(boolean isWar, boolean isCataclysm, boolean isTheft, boolean amIAlive) {
        boolean b = !amIAlive;
        return b && isWar && isCataclysm || isTheft;
    }
    public static boolean isWorldPositivelyGood( boolean isWar, boolean amIHungry, boolean anIHomeless, boolean isEarthCollapsed) {
        boolean b1 = !isWar;
        return b1 && amIHungry && anIHomeless || isEarthCollapsed;
    }
}
