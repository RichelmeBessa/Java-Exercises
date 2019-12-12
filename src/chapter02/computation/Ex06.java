/*
 * Make a vector holding the ten string 'zero', 'one' ... 'nine'. Use that in a
 * program that converts a digit to its corresponding spelled-out value.
 */
package chapter02.computation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> spelled = new ArrayList<String>();
        spelled.add("zero");
        spelled.add("one");
        spelled.add("two");
        spelled.add("three");
        spelled.add("four");
        spelled.add("five");
        spelled.add("six");
        spelled.add("seven");
        spelled.add("eight");
        spelled.add("nine");

        System.out.println("Enter a number between 0 and 10 so that it will be converted in full");
        String afonso = scanner.next();
        switch (afonso) {
            case "0":
                System.out.println(spelled.get(0));
                break;
            case "1":
                System.out.println("one");
                break;
            case "2":
                System.out.println("two");
                break;
            case "3":
                System.out.println("three");
                break;
            case "4":
                System.out.println("four");
                break;
            case "5":
                System.out.println("five");
                break;
            case "6":
                System.out.println("six");
                break;
            case "7":
                System.out.println("seven");
                break;
            case "8":
                System.out.println("eight");;
                break;
            case "9":
                System.out.println("nine");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
