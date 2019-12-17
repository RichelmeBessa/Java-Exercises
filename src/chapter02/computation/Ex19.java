/**
 * Modify the program from previous exercise so that when you enter
 * an integer, the program will output all the names with that score
 * or score not found.
 */
package chapter02.computation;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex19 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        List<String> scores = new ArrayList<>();

        System.out.println("Write your name (ex: Joe) and a number (ex: 17). ('NoName 0' to stop.)");

        String name;
        String score;
        while (true) {

            name = scan.next();
            score = scan.next();

            if (name.equals("NoName") && score.equals("0")) {
                System.out.println("ERROR!");
                break;
            }

            if (name.equals(score)) {
                System.out.println("ERROR!");
                break;
            }

            for (int h = 0; h < names.size(); h++) {
                String a = names.get(h);
                for (int g = 0; g < names.size(); g++) {
                    String b = names.get(g);
                    if (a.equals(b) && b != a) {
                        System.out.println("Not possible insert " + a + " more of times ");
                        System.exit(0);
                    }
                }
            }

            names.add(name);
            scores.add(score);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " " + scores.get(i));
        }

        while (true) {
            System.out.println("Type a scores and found it name corresponding: (Type 'x' to stop)");
            String numer = scan.next();

            if (numer.equals("x")) {
                break;
            }
            boolean invalid = true;
            for (int i = 0; i < scores.size(); i++) {
                if (numer.equals(scores.get(i))) {
                    System.out.println("Name: " + names.get(i));
                    invalid = false;
                }
            }
            if (invalid) {
                System.out.println("Score not found.");
            }

            scan.close();
        }

    }
