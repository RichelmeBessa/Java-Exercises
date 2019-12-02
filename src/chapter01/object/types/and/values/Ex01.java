/**
 * Write a program that prompts a first name and an age, then display the
 * name the user entered with the following age in months.
 * e.g:
 * $ Please enter your first name and age:
 * > John 23
 * "Hello, John Doe (age 276 months).
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name;
        int idade;
        System.out.println("Please enter your first name: ");
        name = scanner.next();
        System.out.println("Now, enter your age: ");
        idade = scanner.nextInt();
        System.out.println("Hello, " + name + " (age " + idade * 12 + " Months)");

    }
}
