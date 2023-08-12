package hw_auguat9;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
        public Random random = new Random();
        public Scanner scanner = new Scanner(System.in);
        int randomNum1 = random.nextInt(50, 100);
        int randomNum2 = random.nextInt(10) + 2;

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

        public void start() {
            String[] players = {"one", "two"};
            String player1 = players[0];
            String player2 = players[1];
            int player1Answer = 0;
            int player2Answer = 0;
            int[] score = {0,0};
            System.out.println();
            System.out.println("Hello! Welcome to MATH QUIZ room! In the beginning enter players names!");
            System.out.println("Player #" + player1 + ", WELCOME! What is your name?");
            String name1 = scanner.next();
            System.out.println("Player #" + player2 + ", WELCOME! What is your name?");
            String name2 = scanner.next();
            System.out.println("Players are " + name1 + " & " + name2 + "   Players current scores " + score[0] + " : " + score[1]);
            System.out.println("Correct answer earns 5 points! Incorrect answer earns -5 points!");
            System.out.println("LET'S BEGIN!");
            while (player1Answer != sum()) {
                System.out.println("QUIZ #1 is for player " + name1);
                System.out.println("QUIZ #1 -What is (" + randomNum1 + " + " + randomNum2 + ")=?");
                player1Answer = scanner.nextInt();
                System.out.println("You entered: " + player1Answer);
                System.out.println("Correct answer: " + sum());
                if (player1Answer == sum()) {
                    System.out.println("Correct! "+name1+", +5 points!");
                    score[0] = score[0] + 5;
                }
                if (player1Answer != sum()) {
                    System.out.println("Wrong! "+name1+", -5 points!");
                    score[0] = score[0] - 5;
                }
            }
            System.out.println("#1 QUIZ is completed! Points earned " + score[0] + " : " + score[1]);
            System.out.println();
            while (player2Answer != add()) {
                System.out.println("QUIZ #2 is for player " + name2);
                System.out.println("QUIZ #2 -What is (" + randomNum1 + " + " + randomNum1 + ")=?");
                player2Answer = scanner.nextInt();
                System.out.println("You entered: " + player2Answer);
                System.out.println("Correct answer: " + add());
                if (player2Answer == add()) {
                    System.out.println("Correct! "+name2+", +5 points!");
                    score[1] = score[1] + 5;
                }
                if (player2Answer != add()) {
                    System.out.println("Wrong! "+name2+", -5 points!");
                    score[1] = score[1] - 5;
                }
            }
            System.out.println("#2 QUIZ is completed! Points earned " + score[0] + " : " + score[0]);
            System.out.println();
            while (player1Answer != subtract()) {
                System.out.println("QUIZ #3 is for player " + name1);
                System.out.println("QUIZ #3 -What is (" + randomNum1 + " - " + randomNum2 + ")=?");
                player1Answer = scanner.nextInt();
                System.out.println("You entered: " + player1Answer);
                System.out.println("Correct answer: " + subtract());
                if (player1Answer == subtract()) {
                    System.out.println("Correct! "+name1+", +5 points!");
                    score[0] = score[0] + 5;
                }
                if (player1Answer != subtract()) {
                    System.out.println("Wrong! "+name1+", -5 points!");
                    score[0] = score[0] - 5;
                }
            }
            System.out.println("#3 QUIZ is completed! Points earned " + score[0] + " : " + score[1]);
            System.out.println();
            while (player2Answer != multiply()) {
                System.out.println("QUIZ #4 is for player " + name2);
                System.out.println("QUIZ #4 -What is: (" + randomNum1 + " * " + randomNum2 + ")=?");
                player2Answer = scanner.nextInt();
                System.out.println("You entered: " + player2Answer);
                System.out.println("Correct answer: " + multiply());
                if (player2Answer == multiply()) {
                    System.out.println("Correct! "+name2+", +5 points!");
                    score[1] = score[1] + 5;
                }
                if (player2Answer != multiply()) {
                    System.out.println("Wrong! "+name2+", -5 points!");
                    score[1] = score[1] - 5;
                }
            }
            System.out.println("#4 QUIZ is completed! Points earned " + score[0] + " : " + score[1]);
            System.out.println();
            while (player1Answer != divide()) {
                System.out.println("QUIZ #5 is for player " + name1);
                System.out.println("QUIZ #5 -What is (" + randomNum1 + " / " + randomNum2 + ")=? ENTER WHOLE 'int' number without REMAINDER!");
                player1Answer = scanner.nextInt();
                System.out.println("You entered: " + player1Answer);
                System.out.println("Correct answer: " + divide());
                if (player1Answer == divide()) {
                    System.out.println("Correct! "+name1+", +5 points!");
                    score[0] = score[0] + 5;
                }
                if (player1Answer != divide()) {
                    System.out.println("Wrong! "+name1+", -5 points!");
                    score[0] = score[0] - 5;
                }
            }
            System.out.println("#5 QUIZ is completed! Points earned " + score[0] + " : " + score[1]);
            System.out.println();
            while (player2Answer != add1()) {
                System.out.println("QUIZ #6 is for player " + name2);
                System.out.println("QUIZ #6 -What is (" + randomNum1 + " + " + randomNum2 + " + " + randomNum1 + ")=?");
                player2Answer = scanner.nextInt();
                System.out.println("You entered: " + player2Answer);
                System.out.println("Correct answer: " + add1());
                if (player2Answer == add1()) {
                    System.out.println("Correct! "+name2+", +5 points!");
                    score[1] = score[1] + 5;
                }
                if (player2Answer != add1()) {
                    System.out.println("Wrong! "+name2+", -5 points!");
                    score[1] = score[1] - 5;
                }
            }
            System.out.println("#6 QUIZ is completed! Points earned " + score[0] + " : " + score[1]);
            System.out.println();
            int[] place = {score[0], score[1]};

                if (score[0] > score[1]) {
                    place[0] = (score[0]);
                    System.out.println(name1+", you won 1-st place! Score: "+score[0]);
                }
                if (score[1] > score[0]) {
                    place[0] = (score[1]);
                    System.out.println(name2+", you won 1-st place! Score: "+score[1]);
                }
                if (score[0] < score[1]) {
                    place[1] = (score[0]);
                    System.out.println(name1+", you won 2-nd place! Score: "+score[0]);
                }
                if (score[1] < score[0]) {
                    place[1] = (score[1]);
                    System.out.println(name2+", you won 2-nd place! Score: "+score[1]);
                }else {
                    System.out.println(name1+" & "+name2+", you both played good! Your scores: "+score[0]+" : "+score[1]);
                }
        }
}
