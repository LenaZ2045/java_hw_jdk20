package hw_july24;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Random random = new Random();
        int int1 = random.nextInt(60);
        int int2 = random.nextInt(20);

        int addReturn = calculator.add(int1, int2);
        int subtractReturn = calculator.subtract(int1, int2);
        int multiplyReturn = calculator.multiply(int1, int2);
        int divideReturn = calculator.divide(int1, int2);

        System.out.println(int1+" + "+int2+" = "+addReturn);
        System.out.println(int1+" - "+int2+" = "+subtractReturn);
        System.out.println(int1+" * "+int2+" = "+multiplyReturn);
        System.out.println(int1+" / "+int2+" = "+divideReturn);
    }
}
