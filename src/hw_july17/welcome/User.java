package hw_july17.welcome;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Thank you for visiting our web-page!");
        System.out.println("To use our web-page's tools you need to be registered.");
        System.out.println("Please, enter your first and last name: ");
        String word = scanner.nextLine();
        System.out.println("Hello, " + word + "! Nice to meet you! All new users get 30-DAYS FREE use of our web-page's tools. Please enjoy!");
        System.out.println();
        System.out.println("Please rate our web-page's tools from 1 to 10, how likely you would recommend our web-page's tools to others?");
        int number = scanner.nextInt();
        System.out.println("You rate us: " + number + " Thank you for participation!");
    }
}
