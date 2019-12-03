/**
 * Do exercise 6, but with three strings values. So, if the user enters the values
 * Steinbeck, Hemingway, Fitzgerald, the output should be Fitzgerald, Hemingway, Steinbeck.
 */
package chapter01.object.types.and.values;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String abc;
        String bca;
        String cba;
        
        System.out.println("Enter first name: ");
        abc = scanner.nextLine();
        System.out.println("Enter second name: ");
        bca = scanner.nextLine();
        System.out.println("Enter third name: ");
        cba = scanner.nextLine();
        
        if (abc.compareTo(bca) <= 0 && bca.compareTo(cba) <= 0) {
            System.out.println(abc + ", " + bca + ", " + cba);    
        } else if (abc.compareTo(cba) <= 0 && cba.compareTo(bca) <= 0) {
            System.out.println(abc + ", " + cba + ", " + bca);     
        }
        if (bca.compareTo(abc) <= 0 && abc.compareTo(cba) <= 0) {
            System.out.println(bca + ", " + abc + ", " + cba);
        } else if (bca.compareTo(cba) <= 0 && cba.compareTo(abc) <= 0) {
            System.out.println(bca + ", " + cba + ", " + abc);
        }
        if (cba.compareTo(bca) <= 0 && bca.compareTo(abc) <= 0) {
            System.out.println(cba + ", " + bca + ", " + abc);
        } else if (cba.compareTo(abc) <= 0 && abc.compareTo(bca) <= 0) {
            System.out.println(cba + ", " + abc + ", " + bca);
        }
    }
}
