/**
 * Write a program that converts spelled-out numbers such as "zero" and
 * "two" into Such as 0 and 2. Do it for the values 1, 2, 3, and 4 and
 * write out not a number I know if the user enters something that 
 * doesn't correspond, such as stupid computer!.
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String spelled;
        System.out.println("Numbers spelled-out to numbers: ");
        spelled = scanner.nextLine();
        if (spelled.equals("one")) {
            System.out.println("1");
        }
        if (spelled.equals("two")){
            System.out.println("2");
        }
        if (spelled.equals("three")){
            System.out.println("3");
        }
        if (spelled.equals("four")){
            System.out.println("4");
        }
       
    }
}
