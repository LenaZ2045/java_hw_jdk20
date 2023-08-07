package hw_july31;

import hw_july24.Calculator;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Calculator calculator = new Calculator();
        int yourAnswer;
        int correctAnswer;
        int num1;
        int num2;
        do {
            num1 = random.nextInt(1000);
            num2 = random.nextInt(1000);
            correctAnswer = calculator.add(num1, num2);
            System.out.println("What is the sum of " + num1 + " + " + num2 + " Type your answer:");
            yourAnswer = scanner.nextInt();
            System.out.println("Your answer is: " + yourAnswer);
            System.out.println("Correct answer is: " + correctAnswer);
        } while (yourAnswer != correctAnswer);
        System.out.println("Congratulations! You added numbers " + num1 + " + " + num2 + " with success!");
    }
}
