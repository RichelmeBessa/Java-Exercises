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
public class Ex05 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (true) {
            long value = scan.nextLong();

            String numb = String.format("%06f", value);
            System.out.println(numb);
        }
    }
}
