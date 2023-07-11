package portland_weather;

public class Main {
    public static void main(String[] args) {
        WeeklyForecast weather = new WeeklyForecast();
        System.out.println();
        System.out.println("USA WEEKLY WEATHER FORECAST in Portland, OR");
        System.out.println();
        System.out.println(weather.weekDay1);
        System.out.println("High temperature is: " + weather.tempMonday + "'F");
        System.out.println("Day will be: " + weather.conditionOfDay3);
        System.out.println();
        System.out.println(weather.weekDay2);
        System.out.println("High temperature is: " + weather.tempTuesday + "'F");
        System.out.println("Day will be: " + weather.conditionOfDay1);
        System.out.println();
        System.out.println(weather.weekDay3);
        System.out.println("High temperature is: " + weather.tempWednesday + "'F");
        System.out.println("Day will be: " + weather.conditionOfDay2);
        System.out.println();
        System.out.println(weather.weekDay4);
        System.out.println("High temperature is: " + weather.tempThursday + "'F");
        System.out.println("Day will be: " + weather.conditionOfDay1);
        System.out.println();
        System.out.println(weather.weekDay5);
        System.out.println("High temperature is: " + weather.tempFriday + "'F");
        System.out.println("Day will be: " + weather.conditionOfDay1);
        System.out.println();
        System.out.println(weather.weekDay6);
        System.out.println("High temperature is: " + weather.tempSaturday + "'F");
        System.out.println("Day will be: " + weather.conditionOfDay2);
        System.out.println();
        System.out.println(weather.weekDay7);
        System.out.println("High temperature is: " + weather.tempSunday + "'F");
        System.out.println("Day will be: " + weather.conditionOfDay1);
    }
}
