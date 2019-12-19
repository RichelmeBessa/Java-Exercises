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
        char unic = 0;
        
        for( int i = length - 2; i>= 0; i--){
            unic = word.charAt(length - 1);
            reverse += word.charAt(i);
        }
        System.out.println("Reverse of the string: " + Character.toUpperCase(unic) + reverse.toLowerCase());
    }
}
