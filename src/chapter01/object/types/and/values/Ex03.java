/**
 * Write a program that prompts the user to enter two integer. Store these
 * values in int variables named val1 and val2. Write your program to determine
 * the smaller, larger, sum, difference, product, and ratio of these values and
 * report them to the user.
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int val1;
        int val2;
        System.out.println("Write number interger");
        val1 = scanner.nextInt();
        System.out.println("Write other number interger");
        val2 = scanner.nextInt();
        if (val1 > val2) {
            System.out.println(val1);
        }
        if (val1 < val2) {
            System.out.println(val2);
        }
        if (val1 > val2) {
            System.out.println("The smaller number is " + val1);
        } else {
            System.out.println("The larger number is " + val2);
        }
        if (val1 < val2) {
            System.out.println("The smaller number is " + val1);
        }
        System.out.println("The sum of the numbers is equal to " + (val1+val2));
        System.out.println("The difference of the number is equal to " + (val1-val2));
        System.out.println("The product of the number is equal to " + (val1*val2));
        System.out.println("The ratio of the number is equal to "+ (val1/val2));
    }
}

