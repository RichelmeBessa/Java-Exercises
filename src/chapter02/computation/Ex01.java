/* 
* Converts from yen, euro, pounds, yuan or Norwegian Krone to dollar.
* The suffix 'y', 'e', 'p', 'u', 'k' indicates the unit of the input
* any other suffix is an error
 */
package chapter02.computation;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value, followed blank-space and your coin (y, e, p, u, k)");

        double value = scanner.nextInt();
        String coin = scanner.next();

        double result = 0;

        switch (coin) {
            case "y":
                result = (value * 0.0092);
                break;
            case "e":
                result = (value * 1.11);
                break;
            case "p":
                result = (value * 1.32);
                break;
            case "u":
                result = (value * 0.14);
                break;
            case "k":
                result = (value * 0.11);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        System.out.println(result + " dollars");
        scanner.close();
    }

}
