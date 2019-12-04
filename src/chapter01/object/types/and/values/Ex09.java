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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number followed by one of these operations and then enter another number.");
        System.out.println("It is noteworthy that there must be spaces between them. Press P, pause");

        while (true) {
            String temp = scanner.next();
            
            if (temp.equals("p")) {
                break;
            }
            
            int a1 = Integer.parseInt(temp);
            String op = scanner.next();
            int a2 = scanner.nextInt();
            
            int result = 0;
            
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
