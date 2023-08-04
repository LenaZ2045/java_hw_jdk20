package hw_july31;

import hw_july24.Calculator;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Calculator calculator = new Calculator();
        int num1 = random.nextInt(1000);
        int num2 = random.nextInt(1000);
        int correctAnswer = calculator.add(num1,num2);
        int yourAnswer;


        do {
            System.out.println("What is the sum of "+num1+" + "+num2+" Type your answer:");
            yourAnswer = scanner.nextInt();
            System.out.println("Your answer is: "+yourAnswer);
            System.out.println("Correct answer is: "+correctAnswer);
        }while (yourAnswer != correctAnswer);

        System.out.println("Congratulations! You added numbers with success!");
    }
}
