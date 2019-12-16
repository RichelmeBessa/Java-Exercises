/**
 * Write a program that finds the min, max and mode of a sequence of strings.
 */
package chapter02.computation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        List<String> sequences = new ArrayList<>();

        System.out.println("Enter with a sequence of strings. Press '.' to stop.");

        while (true) {
            String temp = scan.next();
            if (temp.equals(".")) {
                break;
            }
            sequences.add(temp);
        }

        sequences.sort((a, b) -> a.compareTo(b));

        int countMode = 0;
        String mode = null;

        for (String a : sequences) {
            int countA = 0;

            for (String b : sequences) {
                if (a.equals(b)) {
                    countA++;
                }
            }

            if (countA > countMode) {
                countMode = countA;
                mode = a;
            }
        }
        if (!sequences.isEmpty()) {
            System.out.println(
                    "The smallest is " + sequences.get(0));
            System.out.println(
                    "The biggest is: " + sequences.get(sequences.size() - 1));
        }

        System.out.println("The mode: " + (countMode > 1 ? mode : "doesn't exist."));
    }
}
