package Minggu2;
import java.util.Scanner;

public class Volume_Kubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Volume Kubus =====");

        System.out.print("Masukkan sisi kubus: ");
        double sisi = scanner.nextDouble();
        double volume = sisi * sisi * sisi;

        System.out.println("Volume Kubus Adalah : " + volume);
        scanner.close();
    }
}
