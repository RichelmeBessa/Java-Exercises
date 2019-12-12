/*
 * There is an old story that the emperor wanted to thank the inventor of the
 * game of chess and asked the inventor to name his reward. The inventor asked
 * for one grain of rice for the first square, 2 for the second, 4 for the
 * third, and so on. Write a program to calculate how many squares are required
 * to give the inventor at least 1000 grains of rice, at least 1,000,000 grains,
 * and at least 1,000,000,000 grains.
 */
package chapter02.computation;

import java.util.Scanner;

public class Ex08{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int square;
        while (true){
        System.out.println("Enter with a number for it to be similar to the emperor who referred to rice grains. ");
        square = scanner.nextInt();
        System.out.println(Math.pow(2, square-1)); 
        }
    }
}