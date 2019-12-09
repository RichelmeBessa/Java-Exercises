/*
 * Write a program to play a numbers guessing game. The user thinks a number
 * between 1 and 100 and your program ask questions to figure out what the number
 * is. Your program should be able to identify the number after asking no more
 * than seven questions.
 */
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 100. I'll to guess it (I have six guesses): ");
        int answer = scanner.nextInt();

        if (answer < 1 || answer >= 100) {
            System.out.println("Invalid number, have you heard me about the rules?");
            System.exit(0);
        }

        int guess = 50;
        int half = 50;
        int tries = 0;

        while (true) {
            if (tries > 6) {
                System.out.println("I could not find the number, you won :)");
                break;
            }

            if (answer == guess) {
                System.out.println("Number found, it is " + guess + " right?");
                break;
            }
            
            boolean verification = answer < guess;

            System.out.println("The number you entered is smaller than " + guess + "?");
            System.out.println(verification);

            half = half / 2;

            if (half == 0) {
                half = 1;
            }

            if (verification) {
                guess = guess - half;
            } else {
                guess = guess + half;
            }

            tries++;
        }
    }
}