/*
 * Modify the 'mini calculator' from exercise 5 to accept (just) single-digit
 * numbers written as either digits or spelled-out.
 */
package chapter02.computation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers spelled-out then basic operations and other number. Press 'x' to stop. ");

        while (true) {
       
            String a1 = scanner.next();
            String op = scanner.next();
            String a2 = scanner.next();
            
            if (a1.equals("x") || op.equals("x") || a2.equals("x")) {
                break;
            }
            double numb1 = leprechaum(a1);
            double numb2 = leprechaum(a2);

            double result = 0.0;

            switch (op) {
                case "+":
                    result = (numb1 + numb2);
                    break;
                case "-":
                    result = (numb1 - numb2);
                    break;
                case "*":
                    result = (numb1 * numb2);
                    break;
                case "/":
                    result = (numb1 / numb2);
                    break;
                default:
                    break;
            }
            System.out.println(result);
        }
    }

    private static double leprechaum(String lola)
    {
        String[] numeros = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numeros.length; i++) {
            if (lola.equals(numeros[i])) {
                return i;
            }
        }
        return -1;
    }
}
