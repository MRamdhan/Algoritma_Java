package Minggu2;
import java.util.Scanner;

public class UangKembalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Menghitung Uang Kembalian =====");
        
        System.out.print("Masukkan Total Belanja : ");
        Double totalBelanja = scanner.nextDouble(); 

        System.out.print("Masukkan Uang Bayar : ");
        Double uangBayar = scanner.nextDouble();

        double uangKembalian = uangBayar - totalBelanja ;
        
        System.out.println("Uang Kembalian : " + uangKembalian);
        scanner.close();    
    }
}
