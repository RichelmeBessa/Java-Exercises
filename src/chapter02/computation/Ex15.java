/**
 * Write a program to solve quadratic equations.
 */
package chapter02.computation;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter a value to a: ");
        a = scan.nextInt();
        System.out.println("Enter a value to b: ");
        b = scan.nextInt();
        System.out.println("Enter a value to c: ");
        c = scan.nextInt();
        int delta = (b * b) - (4 * a * c);
        System.out.println("The value of delta is: " + delta);
        if (delta == 0 || delta >= 1) {
            int x1 = 0;
            int x2 = 0;
            x1 = (int) ((-b + (Math.sqrt(delta))) / (2 * a));
            x2 = (int) ((-b - (Math.sqrt(delta))) / (2 * a));
            
            System.out.println("The value x1 is: " + x1);
            System.out.println("The value x2 is: " + x2);
        } else {
            System.out.println("ERROR!");
        }
    }
}
