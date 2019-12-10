package chapter02.computation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author richelme
 */
public class Fire {

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner fileNameScanner = new Scanner(System.in);
        System.out.println("Enter with a filename: ");
        String filename = fileNameScanner.next();
        File file = new File(filename);
        FileInputStream inputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(inputStream);

        List<Double> temperatures = new ArrayList<>();

        double total = 0;
        while (scanner.hasNext()) {
            String input = scanner.next();
            temperatures.add(Double.parseDouble(input));
        }

        temperatures.sort((a, b) -> a.compareTo(b));

        for (Double temperature : temperatures) {
            total += temperature;
        }

        double median = 0;
        int hindx = temperatures.size() / 2;

        if (temperatures.size() % 2 == 0) {
            median = (temperatures.get(hindx) + temperatures.get(hindx - 1)) / 2;
        } else {
            median = temperatures.get(temperatures.size() / 2);
        }
        System.out.println("The average is :" + total / temperatures.size());
        System.out.println("The median is: " + median);
    }

}
