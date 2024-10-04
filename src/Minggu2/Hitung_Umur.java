package Minggu2;
import java.util.Scanner;

public class Hitung_Umur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("===== Menghitung Umur Anda =====");
        System.out.print("Masukkan tahun sekarang: ");
        int tahun_sekarang = scanner.nextInt(); 

        System.out.print("Masukkan tahun lahir: ");
        int tahun_lahir = scanner.nextInt(); 

        int umur = tahun_sekarang - tahun_lahir;

        System.out.println("Umur saya: " + umur + " Tahun ");

        scanner.close(); 
    }
}
