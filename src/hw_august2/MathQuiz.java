package hw_august2;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public Random random = new Random();
    public Scanner scanner = new Scanner(System.in);
    int userAnswer;
    int score = 0;
    public String name = "";
    int randomNum1 = random.nextInt(50, 100);
    int randomNum2 = random.nextInt(10)+2;
    public int sum() {
        return randomNum1 + randomNum2;
    }
    public int add() {
        return randomNum1 + randomNum1;
    }
    public int add1() {
        return randomNum1 + randomNum2 + randomNum1;
    }
    public int subtract() {
        return randomNum1 - randomNum2;
    }
    public int multiply() {
        return randomNum1 * randomNum2;
    }
    public int divide() {
        return randomNum1 / randomNum2;
    }
public void start()
    {
        while (userAnswer != sum()) {
            System.out.println();
            System.out.println("QUIZ #1 -What is ("+randomNum1+" + "+randomNum2+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+sum());
            if (userAnswer == sum()) {
                System.out.println("Correct! +5 points!");
                score = score + 5;
            }
            if (userAnswer != sum()) {
                System.out.println("Wrong! -5 points!");
                score = score - 5;
            }
        }
        System.out.println("#1 QUIZ is completed! Points earned: "+score);
        System.out.println();
        while (userAnswer != add()) {
            System.out.println("QUIZ #2 -What is ("+randomNum1+" + "+randomNum1+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+add());
            if (userAnswer == add()) {
                System.out.println("Correct answer! +5 points!");
                score = score + 5;
            }
            if (userAnswer != add()) {
                System.out.println("Wrong answer! -5 points!");
                score = score - 5;
            }
        }
        System.out.println("#2 QUIZ is completed! Points earned: "+score);
        System.out.println();
        while (userAnswer != subtract()) {
            System.out.println("QUIZ #3 -What is ("+randomNum1+" - "+randomNum2+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+subtract());
            if (userAnswer == subtract()) {
                System.out.println("Correct! +5 points!");
                score = score + 5;
            }
            if (userAnswer != subtract()) {
                System.out.println("Wrong! -5 points!");
                score = score - 5;
            }
        }
        System.out.println("#3 QUIZ is completed! Points earned: "+score);
        System.out.println();
        while (userAnswer != multiply()) {
            System.out.println("QUIZ #4 -What is: ("+randomNum1+" * "+randomNum2+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+multiply());
            if (userAnswer == multiply()) {
                System.out.println("Correct! +5 points!");
                score = score + 5;
            }
            if (userAnswer != multiply()) {
                System.out.println("Wrong! -5 points!");
                score = score - 5;
            }
        }
        System.out.println("#4 QUIZ is completed! Points earned: "+score);
        System.out.println();
        while (userAnswer != divide()) {
            System.out.println("QUIZ #5 -What is ("+randomNum1+" / "+randomNum2+")=? ENTER WHOLE 'int' number without REMAINDER!");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+divide());
            if (userAnswer == divide()) {
                System.out.println("Correct! +5 points!");
                score = score + 5;
            }
            if (userAnswer != divide()) {
                System.out.println("Wrong! -5 points!");
                score = score - 5;
            }
        }
        System.out.println("#5 QUIZ is completed! Points earned: "+score);
        System.out.println();
        while (userAnswer != add1()) {
            System.out.println("QUIZ #6 -What is ("+randomNum1+" + "+randomNum2+" + "+randomNum1+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+add1());
            if (userAnswer == add1()) {
                System.out.println("Correct! +5 points!");
                score = score + 5;
            }
            if (userAnswer != add1()) {
                System.out.println("Wrong! -5 points!");
                score = score - 5;
            }
        }
        System.out.println("#6 QUIZ is completed! Points earned: "+score);
        System.out.println();
        System.out.println("Congratulations, "+name+"! You completed six MATH QUIZZES! Points "+name+", earned for MATH QUIZZES = "+score+'!');
    }
}
