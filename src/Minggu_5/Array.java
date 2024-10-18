package Minggu_5;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa : ");
        int jumlahMahasiswa = inputan.nextInt();

        String[] Mahasiswa = new String[jumlahMahasiswa];
        int[] Nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukan nama mahasiswa : ");
            Mahasiswa[i] = inputan.next();
            System.out.print("Masukan nilai mahasiswa : ");
            Nilai[i] = inputan.nextInt();
        }

        System.out.println("Berikut nama-nama yang diinputkan beserta nilainya : ");
        int totalNilai = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nama : " + Mahasiswa[i] + " Nilai : " + Nilai[i]);
            totalNilai += Nilai[i];
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataRata);

        inputan.close();
    }
}