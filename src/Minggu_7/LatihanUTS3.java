package Minggu_7;
import java.util.ArrayList;
import java.util.Scanner;

class Keterangan {
    String matkul;
    int sks;
    double nilai;

    Keterangan(String matkul, int sks, double nilai) {
        this.matkul = matkul;
        this.sks = sks;
        this.nilai = nilai;
    }

    double getNilai() {
        return nilai;
    }

    int getSKS() {
        return sks;
    }

    String getmatkul() {
        return matkul;
    }
}

public class LatihanUTS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Keterangan> keterangan = new ArrayList<>();

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
            double nilai = scanner.nextDouble();
            scanner.nextLine();

            keterangan.add(new Keterangan(matkul,sks,nilai));

            System.out.print("Tambahkan mata kuliah lain? (y/n): ");
            tambah = scanner.nextLine();
        } while (tambah.equalsIgnoreCase("y"));

        System.out.println("=======================================================");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Daftar dan Data Mata Kuliah:");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-3s %-20s %-5s %-5s\n",
                        "No","Nama Mata Kuliah", "SKS", "Nilai");
        
        for(int i =0; i < keterangan.size(); i++){
            Keterangan ket = keterangan.get(i);
            System.out.printf("%-3d %-20s %-5d %-5.1f\n", (i + 1), ket.getmatkul(), ket.getSKS(), ket.getNilai());
        }
        System.out.println("=======================================================");

        scanner.close();
    }
}
