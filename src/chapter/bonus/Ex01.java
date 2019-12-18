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
public class Ex01 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Write a word:");
        String word = scan.next();
        String reverse = "";
        
        int length = word.length();
        
        for( int i = length - 1; i>= 0; i--){
            reverse += word.charAt(i);
        }
        System.out.println("Reverse of the string: " + reverse);
    }
}
