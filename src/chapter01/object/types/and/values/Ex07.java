/**
 * Write a program to test an integer value to determine if it is odd or even.
 * As always, make sure your output is clear and complete. In other words,
 * don't just use yes or no. Your output should stand alone, like the value 4
 * is an even number.
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        System.out.println("Enter a number even or odd ");
        number = scanner.nextInt();
        if ((number % 2) == 0)
            System.out.println("The " + number + " is even!");
        else
            System.out.println("The " + number + " is odd!");
    }
}
