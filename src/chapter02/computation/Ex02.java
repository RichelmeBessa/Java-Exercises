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

    public void print(T msg)
    {
        System.out.println(msg);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Boolean> gay = new ArrayList<>();

        gay.add(true);
        gay.add(false);
        gay.add(true);
        gay.add(false);
        gay.add(true);

        System.out.println("Is Richelme gay?");
        for (int i = 0; i < gay.size(); i++) {
            System.out.println(gay.get(i));
        }
    }
}
