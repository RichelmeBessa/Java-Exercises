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
        int garden;

        while (true) {
            System.out.println("Enter with a number for it to be similar to the emperor who referred to rice grains.");
//            square = scanner.nextInt();
            garden = scanner.nextInt();
//            System.out.println(Math.pow(a, square - 1));
//            System.out.println(Math.pow(a, garden - 1));
            Integer total = 1;

            for (int i = 1; i < garden; ++i) {
                total *= 2;
            }

            System.out.println(total);
        }
//        Large number byte is 8.
//        Larger number short is 24
//        Large number integer is 32.
//        Large numbes long is 64.
//        Large number float is 128.
//        Large number double is 1024
    }
}
