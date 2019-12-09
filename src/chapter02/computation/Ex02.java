/**
 * Prompt a user to pass a list of temperatures or inform 'x' to stop.
 * Then after the user input, compute the average and the median temperature
 * the user entered.
 */
package chapter02.computation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02<T> {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Double> temperatures = new ArrayList<>();

        double total = 0;
        while (true) {

            System.out.println("Enter a temperature:  ");
            String input = scanner.next();
            if (input.equals("x")) {
                break;
            }
            temperatures.add(Double.parseDouble(input));
        }
        
        for (Double temperature : temperatures) {
            total += temperature;
        }

        System.out.println("A media e:" + total / temperatures.size());

    }

}
