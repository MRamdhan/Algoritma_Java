import java.util.Scanner;

public class Telur {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Menghitung Harga Telur =====");


        System.out.print("Masukkan (kg) telur yang dibeli!! (per kilo 28.000): ");
        double KgTelur = scanner.nextDouble();

        System.out.print("Masukkan Uang Bayar: ");
        double Bayar = scanner.nextDouble();

        double HargaPerKilo = 28000;
        double TotalHarga = KgTelur * HargaPerKilo;
        double UangKembalian = Bayar - TotalHarga;

        System.out.println("Jumlah Telur : " + KgTelur + " kilo");
        System.out.println("Total Bayar : " + TotalHarga);
        System.out.println("Uang Kembalian : " + UangKembalian);

        scanner.close();
    }
}
