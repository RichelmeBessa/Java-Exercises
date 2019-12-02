/**
 * Write a program that converts from miles to kilometers. Your program should
 * have a reasonable prompt for the user to enter a number of miles.
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int miles;
        System.out.println("Enter the amount of miles");
        miles = scanner.nextInt();
        System.out.println(miles + " miles is " + miles * 1.609344 + " kilometers");
        
    } 
}
