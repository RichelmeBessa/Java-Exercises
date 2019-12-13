/**
 * Write a program that takes an input value n and then find the first n primes.
 */
package chapter02.computation;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("Enter a number beetwen 1 and 100, then the program will find prime numbers between 1 and 100. Press '0' to break.");
            n = scan.nextInt();
            if (n < 1) {
                System.out.println("ERROR");
                break;
            }
            boolean prime = false;
            int primescount = 0;
            
            for (int i = 1; ; i++) {
                prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                    }
                }
                if (prime) {
                    primescount++;
                    System.out.println("#" + primescount + " - " + i);
                    
                    if (primescount == n) {
                        break;
                    }
                }
            }
        }
    }
}

 

            

            