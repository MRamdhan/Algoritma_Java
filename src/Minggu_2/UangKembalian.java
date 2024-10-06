package Minggu_2;

import java.util.Scanner;

public class UangKembalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Menghitung Uang Kembalian =====");
        
        System.out.print("Masukkan Total Belanja : ");
        Double totalBelanja = scanner.nextDouble(); 

        System.out.print("Masukkan Uang Bayar : ");
        Double uangBayar = scanner.nextDouble();

        if (uangBayar >= totalBelanja) {
            double uangKembalian = uangBayar - totalBelanja ;
            System.out.println("Uang Kembalian : " + uangKembalian);
        } else{
            System.out.println("Uang Bayar Tidak Cukup!");
        }
        scanner.close();    
    }
}
