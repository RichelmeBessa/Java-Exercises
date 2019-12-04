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
        int pennies = scanner.nextInt();
        System.out.println("Value nickels: ");
        int nickels = scanner.nextInt();
        System.out.println("Value dimes: ");
        int dimes = scanner.nextInt();
        System.out.println("Value quarters: ");
        int quarters = scanner.nextInt();
        System.out.println("Value half-dollar: ");
        int half = scanner.nextInt();
        System.out.println("Value dollar: ");
        int dollar = scanner.nextInt();
        
        System.out.println("You have: " + pennies + " pennies");
        System.out.println("You have: " + nickels + " nickels");
        System.out.println("You have: " + dimes + " dimes");
        System.out.println("You have: " + quarters + " quarters");
        System.out.println("You have: " + half + " half-dollars");
        System.out.println("You have: " + dollar + " dollars");
        System.out.println(pennies*0.01 + nickels*0.05 + dimes*0.1 + quarters*0.25 + half*0.5 + dollar);
        
    }
}
