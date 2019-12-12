/*
 * Write a program that plays the game "Rock, Paper, Scissors". User enter with
 * one option and the computar should select an option randomly.
 */
package chapter02.computation;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] arrea = {"ROCK", "PAPER", "SCISSORS"};

        while (true) {
            System.out.println("Now we are going to play. rock-1, paper-2, scissors-3.");
            String input = scanner.next();
            if (input.equals("x")) {
                break;
            }
            int user = Integer.parseInt(input) - 1;
            if (user >= 3) {
                System.out.println("ERROR");
                continue;
            }
            int option = random.nextInt(arrea.length);
            System.out.println(arrea[user] + " vs " + arrea[option]);

            if (user == option) {
                System.out.println("Draw");
                continue;
            }    
            if (user == 0 && option == 2
                    || user == 1 && option == 0
                    || user == 2 && option == 1) {
                System.out.println("You won");
            } else {
                System.out.println("You lost!");
            }
        }
    }
}
