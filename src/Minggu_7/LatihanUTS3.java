package Minggu_7;
import java.util.ArrayList;
import java.util.Scanner;

class Keterangan {
    String matkul;
    int sks;
    double nilaigetNilai;

    Keterangan(String matkul, int sks, double nilaigetNilai) {
        this.matkul = matkul;
        this.sks = sks;
        this.nilaigetNilai = nilaigetNilai;
    }
}

class JenisKeterangan {
    Keterangan keterangan;

    JenisKeterangan(Keterangan keterangan) {
        this.keterangan = keterangan;
    }

    double getNilai() {
        return keterangan.nilaigetNilai;
    }

    int getSKS() {
        return keterangan.sks;
    }

    String getmatkul() {
        return keterangan.matkul;
    }
}

public class LatihanUTS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<JenisKeterangan> pilihan = new ArrayList<>();

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine();

        String tambah;
        do {
            System.out.print("Masukkan nama mata kuliah: ");
            String matkul = scanner.nextLine();

            System.out.print("Masukkan SKS: ");
            int sks = scanner.nextInt();

            System.out.print("Masukkan nilai: ");
            double nilaigetnilai = scanner.nextDouble();
            scanner.nextLine();

            Keterangan keterangan = new Keterangan(matkul, sks, nilaigetnilai);
            pilihan.add(new JenisKeterangan(keterangan));

            System.out.print("Tambahkan mata kuliah lain? (y/n): ");
            tambah = scanner.nextLine();
        } while (tambah.equalsIgnoreCase("y"));

        System.out.println("=======================================================");
        System.out.println("\nNama Mahasiswa: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Daftar Mata Kuliah:");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-20s %-5s %-5s\n", "Nama Mata Kuliah", "SKS", "Nilai");
        
        for (JenisKeterangan item : pilihan) {
            System.out.printf("%-20s %-5d %-5.2f\n", item.getmatkul(), item.getSKS(), item.getNilai());
        }
        System.out.println("=======================================================");

        scanner.close();
    }
}
