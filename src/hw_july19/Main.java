package hw_july19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextMessage type = new TextMessage();
        type.textMain(type.text);
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println();
        System.out.println("Your sentence contains swear word!");
        String TextMessage = type.text;
        String replace = TextMessage.replace("fuck", "f**k");
        System.out.println("You can't use swear word like: " + replace);
        System.out.println();
        type.textMain(type.text);
        Scanner scanner1 = new Scanner(System.in);
        scanner1.next();
        System.out.println();
        System.out.println("Your sentence has non- dictionary word!");
        String TextMessage1 = type.text1;
        String replace1 = TextMessage1.replace("bullshit", "b******t");
        System.out.println("May you use dictionary word instead of: " + replace1);
        System.out.println();
        type.textMain(type.text1);
        Scanner scanner2 = new Scanner(System.in);
        scanner2.next();
        System.out.println();
        System.out.println("Did you use vocabulary words?");
        System.out.println("Watch your speech using proper words!");
        String TextMessage2 = type.text2;
        String capital = TextMessage2.toUpperCase();
        System.out.println();
        System.out.println(capital);
    }
}
