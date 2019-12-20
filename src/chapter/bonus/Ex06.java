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
public class Ex06 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String strin = scan.next();

        String[] split = strin.split("a", strin.length() + 3);
        String result = "";
        for (String s : split) {
            result += s + "o";
            String.valueOf(result);
        }
        System.out.println(result);

    }
}
