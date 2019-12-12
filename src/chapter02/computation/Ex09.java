/*
 * Try to calculate the number of rice grains that the inventor asked for the in
 * exercise 8 above. You'll find that the number is so large that it won't fit in
 * an int and as a double. What is the largest number of squares for which you can
 * calculate the exact number of grains using an int?  and using a double?
 */
package chapter02.computation;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);
            
//            int square;
        double garden;
        double a = 2;
        
        while (true) {
            System.out.println("Enter with a number for it to be similar to the emperor who referred to rice grains.");
//            square = scanner.nextInt();
            garden = Double.parseDouble(scanner.next());
//            System.out.println(Math.pow(a, square - 1));
            System.out.println(Math.pow(a, garden - 1));
        }
//        Large number integer is 1024.  
//        Large number double is 24.2
    }
}
