/*
 * Write a program that performs as a very simple calculator. Your calculator
 * should be able to handle the four basic math operations. Your program 
 * should prompt the user to enter three arguments: two doubles values and a 
 * character to represent an operation.
 */
package chapter02.computation;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number then basic operations and other number. Press 'x' to stop. ");
        
        while (true) {
            String oper = scanner.next();

            if (oper.equals("x")) {
                break;
            }

            double a1 = Double.parseDouble(oper);
            String op = scanner.next();
            double a2 = Double.parseDouble(scanner.next());

            double result = 0.0;

            switch (op) {
                case "+":
                    result = (a1 + a2);
                    break;
                case "-":
                    result = (a1 - a2);
                    break;
                case "*":
                    result = (a1 * a2);
                    break;
                case "/":
                    result = (a1 / a2);
                    break;
                default:
                    break;
            }
            System.out.println(result);
        }
    }
}