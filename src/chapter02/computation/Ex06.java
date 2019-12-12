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
                System.out.println(spelled.get(1));
                break;
            case "2":
                System.out.println(spelled.get(2));
                break;
            case "3":
                System.out.println(spelled.get(3));;
                break;
            case "4":
                System.out.println(spelled.get(4));
                break;
            case "5":
                System.out.println(spelled.get(5));
                break;
            case "6":
                System.out.println(spelled.get(6));
                break;
            case "7":
                System.out.println(spelled.get(7));
                break;
            case "8":
                System.out.println(spelled.get(8));
                break;
            case "9":
                System.out.println(spelled.get(9));
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
