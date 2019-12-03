/**
 * Write a program that prompts the user to enter three integer values, and
 * then outputs the values in numerical sequence separated by commas. So, if
 * the user enters the values 10 4 6, the output should be 4, 6, 10. If two
 * values are the same, the should just be ordered together. So the input
 * 4 5 4. should give 4, 4 5.
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Enter first number integer: ");
        a = scanner.nextInt();
        System.out.println("Enter second number integer: ");
        b = scanner.nextInt();
        System.out.println("Enter third number integer:");
        c = scanner.nextInt();

        if (a <= b && b <= c){
            System.out.println("The numbers ordener are: " + a + ", " + b + ", "+ c);
        } else if (a <= c && c <= b) {
            System.out.println("The numbers ordener are: " + a + ", " + c + ", " + b);
        } else if (b <= a && a <= c) {
            System.out.println("The numbers ordener are: " + b + ", " + a + ", " + c);
        } else if (b <= c && c <= a) {
            System.out.println("The numbers ordener are: " + b + ", " + c + ", " + a);
        } else if (c <= b && b <= a) {
            System.out.println("The numbers ordener are: " + c + ", " + b + ", " + a);
        } else if (c <= a && a <= b) {
            System.out.println("The numbers ordener are: " + c + ", " + a + ", " + b);
        }
    }
}
