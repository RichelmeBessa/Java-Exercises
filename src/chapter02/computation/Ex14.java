/**
 * The number that appears the most times in a sequence
 * is called the mode. Create a program that finds the mode,
 * the average and the median of a set of positive integers
 */
package chapter02.computation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter with a set of positive integers separeted by blank space (Press 'x' to finish): ");
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = scan.next();

            if (input.equals("x")) {
                break;
            }

            numbers.add(Integer.parseInt(input));
        }
        int total = 0;

        for (Integer number : numbers) {
            total += number;
        }

        System.out.println("The average is: " + total / numbers.size());

        if (numbers.size() % 2 == 0) {
            int a = numbers.get(numbers.size() / 2 - 1);
            int b = numbers.get(numbers.size() / 2);
            System.out.println("The median is: " + (a + b) / 2);

        } else {
            System.out.println("The median is: " + numbers.get(numbers.size() / 2));
        }
        
        int maior = 0;
        int moda = 0;
        
        for (Integer number : numbers) {
            int count = 0;           
            for (Integer namber : numbers) {
                if(namber == number){
                    count++;
                }
            }
            
            if(count > maior){
              maior = count;
              moda = number;
            }
        }

        
        System.out.println("The mode is: " + moda);
    }
}
