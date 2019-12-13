/**
 * Create a program to find all the prime numbers between 1 and 100. Then write
 * a loop that goes from 1 to 100, checks each number to see if it is a prime,
 * and stores each prime found in a vector. Write another loop that lists the
 * primes you found.
 */
package chapter02.computation;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numb;

        while (true) {
            System.out.println("Enter a number beetwen 1 and 100, then the program will find prime numbers between 1 and 100. Press '0' to break.");
            numb = scan.nextInt();
            if (numb < 1 || numb > 100) {
                System.out.println("ERROR");
                break;
            }
            int i;
            boolean prime = false;
            for (i = 0; i < 100; i++) {
                prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                    }
                }
                if (prime) {
                    System.out.println(i);
                }
            }
        }
    }
}
