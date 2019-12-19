/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.bonus;

import java.util.Scanner;

/**
 *
 * @author richelme
 */
public class Ex04 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a word: ");
            String word = scan.next();
            if (word.length() > 3) {
                System.out.println(word.substring(word.length() - 3));
            } else {
                System.out.println(word);
            }
        }
    }
}
