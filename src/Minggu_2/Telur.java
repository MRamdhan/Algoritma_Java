package Minggu_2;

import java.util.Scanner;

public class Telur {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Menghitung Harga Telur =====");


        System.out.print("Masukkan (kg) telur yang dibeli!! (per kilo 28.000): ");
        double KgTelur = scanner.nextDouble();

        double HargaPerKilo = 28000;
        double TotalHarga = KgTelur * HargaPerKilo;
        System.out.println("Total Harga " + TotalHarga);

        System.out.print("Masukkan Uang Bayar: ");
        double Bayar = scanner.nextDouble();
        
        
        if (Bayar >= TotalHarga) {
            double UangKembalian = Bayar - TotalHarga;
            System.out.println("Jumlah Telur : " + KgTelur + " kilo");
            System.out.println("Uang Bayar : " + Bayar);
            System.out.println("Total Bayar : " + TotalHarga);
            System.out.println("Uang Kembalian : " + UangKembalian);
        } else{
            System.out.println("Uang yang dimasukkan kurang");
        }

        scanner.close();
    }
}
