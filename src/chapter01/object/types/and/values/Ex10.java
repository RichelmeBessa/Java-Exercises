/**
 * Write a program that prompts the user to enter some number of pennies,
 * nickels, dimes, quarters, half-dollars, and one dollar. Query the user
 * separately for the numbers of each coin. If only one of a coin is
 * reported, make the output grammatically correct. Also, report the sum
 * in dollars and cents.
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number pennies, nickels, dimes , quarters, hald-dollars and dollar.");

        System.out.println("Value pennies: ");
        double pennies = scanner.nextDouble();
        System.out.println("Value nickels: ");
        double nickels = scanner.nextDouble();
        System.out.println("Value dimes: ");
        double dimes = scanner.nextDouble();
        System.out.println("Value quarters: ");
        double quarters = scanner.nextDouble();
        System.out.println("Value half-dollar: ");
        double half = scanner.nextDouble();
        System.out.println("Value dollar: ");
        double dollar = scanner.nextDouble();

        if (pennies > 1) {
            System.out.println("You have: " + pennies + " pennies");
        } else {
            System.out.println("You have: " + pennies + " pennie");
        }

        if (nickels > 1) {
            System.out.println("You have: " + nickels + " nickels");

        } else {
            System.out.println("You have: " + nickels + " nickel");
        }

        if (dimes > 1) {
            System.out.println("You have: " + dimes + " dimes");
        } else {
            System.out.println("You have: " + dimes + " dime");
        }

        if (quarters > 1) {
            System.out.println("You have: " + quarters + " quarters");

        } else {
            System.out.println("You have: " + quarters + " quarter");
        }

        if (half > 1) {
            System.out.println("You have: " + half + " half-dollars");

        } else {
            System.out.println("You have: " + half + " half-dollar");
        }

        if (dollar > 1) {
            System.out.println("You have: " + dollar + " dollars");

        } else {
            System.out.println("You have: " + dollar + " dollar");
        }

        double result = 0;
        result += pennies * 0.01;
        result += nickels * 0.05;
        result += dimes * 0.1;
        result += quarters * 0.25;
        result += half * 0.5;
        result += dollar;

        int finish = (int) result;

        System.out.printf("You have %d dollars and %.2s cents\n", finish, (result - finish) * 100);
        scanner.close();
    }
}
