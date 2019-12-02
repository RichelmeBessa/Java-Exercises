/**
 * Modify the previous program to ask the user to enter floating-point values and
 * and store them in double variables.
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double val1;
        double val2;
        System.out.println("Write number floating");
        val1 = Double.parseDouble(scanner.next());
        System.out.println("Write other number floating");
        val2 = Double.parseDouble(scanner.next());
        if (val1 > val2) {
            System.out.println("The biggest number is " + val1);
            System.out.println("The smallest number is " + val2);
        } else {
            System.out.println("The biggest number is " + val2);
            System.out.println("The smallest number is " + val1);
        }

        System.out.println("The sum of the numbers is equal to " + (val1 + val2));
        System.out.println("The difference of the number is equal to " + (val1 - val2));
        System.out.println("The product of the number is equal to " + (val1 * val2));
        System.out.println("The ratio of the number is equal to " + (val1 / val2));
    }
}

