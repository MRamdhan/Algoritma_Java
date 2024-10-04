
import java.util.Scanner;

public class Menghitung_Suhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Konversi Celcius ke Fahrenheit =====");

        System.out.print("Input suhu dalam Celcius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        scanner.close();
    }
}
