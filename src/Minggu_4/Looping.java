package Minggu_4;
import java.util.Scanner;
public class Looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Bintang : ");
        int baris = scanner.nextInt();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
