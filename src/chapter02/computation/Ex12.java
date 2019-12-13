/**
 * Modify the program described in the previous exercise to take an
 * input value max and then find all prime numbers from 1 to max
 */
package chapter02.computation;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max;

        while (true) {
            System.out.println("Enter a number beetwen 1 and 100, then the program will find prime numbers between 1 and 100. Press '0' to break.");
            max = scan.nextInt();
            if (max < 1) {
                System.out.println("ERROR");
                break;
            }
            int i;
            boolean prime = false;
            for (i = 0; i < max; i++) {
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


 