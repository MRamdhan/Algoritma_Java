
import java.util.Scanner;

public class Keliling_Lingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Keliling Lingkaran =====");

        System.out.print("Masukkan jari jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        
        double lingkaran = 2 * Math.PI * jariJari;
        System.out.println("Keliling lingkaran: " + (int)lingkaran);

        scanner.close();
    }
}
