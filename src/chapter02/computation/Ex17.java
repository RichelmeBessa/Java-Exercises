/**
 * Modify the program from previous exercise so that when you enter a name,
 * the program will output the corresponding score or "name not found".
 */

/**
 * Write a program where you first enter a set of name-and-value pairs, such
 * as Joe 17 and Barbara 22. For each pair, add the name to the vector called
 * names and the number to a vector called scores (in corresponding positions,
 * so that if names[7]=="Joe" then scores[7]==17). Terminate input with
 * NoName 0. Check that each name is unique and terminate with an error message
 * if a name is entered twice. Write out all the (name, score) pairs, one per
 * line.
 */
package chapter02.computation;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex17 {

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
        scan.close();
    }

}
