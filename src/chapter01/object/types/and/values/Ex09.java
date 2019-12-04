/**
 * Write a program that takes an operation followed by two operands and outputs the
 * result. For example:
 * 100 + 3.14 = 103.14
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args)
    {
        int a1;
        int a2;
        String op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sum: ");
        a1 = scanner.nextInt();
        op = scanner.next();
        a2 = scanner.nextInt();
        if (op.equals("+")) {
            System.out.println(a1 + " " + op + " " + a2 + " = " + (a1 + a2));
        } else if (op.equals("-")) {
            System.out.println(a1 + " " + op + " " + a2 + " = " + (a1 - a2));
        } else if (op.equals("*")) {
            System.out.println(a1 + " " + op + " " + a2 + " = " + (a1 * a2));
        } else if (op.equals("/")) {
            System.out.println(a1 + " " + op + " " + a2 + " = " + (a1 / a2));
        }
    }
}
