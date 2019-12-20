package chapter.bonus.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author richelme
 */
public class Ex07 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a product followed by a price. Press '.' to pause");
        List<Product> products = new ArrayList<>();

        while (true) {
            String description = scan.next();
            if (description.equals(".")) {
                break;
            }
            Double price = Double.parseDouble(scan.next());

            products.add(new Product(description, price));

        }
        
        products.sort((a, b) -> a.getPrice().compareTo(b.getPrice()));
        System.out.println("The mostr expensive is: " + products.get(0).getDescription());
    }
}
