package hw_july26;

import static hw_july26.WorldState.isWorldNegativelyGood;
import static hw_july26.WorldState.isWorldPositivelyGood;

public class WorldStateMain {
    public static void main(String[] args) {
        WorldState worldState = new WorldState();
        boolean isWorldNegative = false;
        boolean isWorldPositive = true;
        System.out.println("1: Is our world is negative when we have wars? "+worldState.isWar);
        System.out.println("2: Is our world is negative when we have thefts? "+worldState.isTheft);
        System.out.println("3: Is our world is negative when we have cataclysms? "+worldState.isCataclysm);
        System.out.println("4: If world is negative am I alive? " +worldState.amIAlive);
        System.out.println("5: If world is negative am I hungry? "+worldState.amIHungry);
        System.out.println("6: If world is negative am I homeless? "+worldState.anIHomeless);
        System.out.println("7: If world is negative our earth collapsed yet? "+worldState.isEarthCollapsed);
        System.out.println();
        System.out.println("Is our world at good state? " + isWorldNegativelyGood(worldState.isWar, worldState.isCataclysm, worldState.isTheft, worldState.amIAlive));
        System.out.println("After the survey, I still can survive but need changes to improve living? "+isWorldPositive);
        System.out.println();
        System.out.println("Is EARTH COLLAPSED? "+isWorldPositivelyGood(worldState.isWar, worldState.amIHungry, worldState.anIHomeless, worldState.isEarthCollapsed));
        System.out.println("In conclusion, is our world negative? "+isWorldNegative);
    }
}
