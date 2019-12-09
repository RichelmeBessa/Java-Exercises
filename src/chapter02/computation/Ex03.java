/**
 * Read a sequence of double values into a vector. Think of each value
 * as the distance between two cities along a given route. Compute and
 * print the total distance (the sum of all distances). Find and print
 * the smallest and greatest distance between two neighboring cities.
 * Find and print the mean distance between two neighboring cities.
 */
package chapter02.computation;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Ex03 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Vector<Double> vector = new Vector<>();
        double total = 0;
        System.out.println("Follow the instruction above. Press 'x' to pause.");
        
        while (true) {
            System.out.println("Enter a distance");
            String input = scanner.next();
            
            if (input.equals("x")){
                break;
            }
            vector.add(Double.parseDouble(input));
        }
        double bigger = 0;
        double smallest = Double.MAX_VALUE;
        for (Double distance : vector){
            total += distance;
            if (distance > bigger){
                bigger = distance;
            } 
            if (distance < smallest){
                smallest = distance;
            }
            
        }
        Collections.sort(vector);
        System.out.println("The sum of distance is: " + total );
        System.out.println("The smallest distance is " + smallest);
        System.out.println("The greatest distance is " + bigger);
        System.out.println("The average of cities is: " + total / vector.size());
    }
}
