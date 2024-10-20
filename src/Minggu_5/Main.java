package Minggu_5;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    int nilai;

    Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    String getStatus() {
        // Menggunakan if statement
        if (nilai >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();
        input.nextLine(); // consume newline

        Mahasiswa[] mahasiswaArr = new Mahasiswa[jumlah];

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            input.nextLine(); // consume newline

            mahasiswaArr[i] = new Mahasiswa(nama, nilai);
            System.out.println("----------------------------");
        }

        // Tampilkan daftar nilai mahasiswa
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.printf("%-3s %-10s %-5s %-10s\n", "No", "Nama", "Nilai", "Status");

        double totalNilai = 0;

        for (int i = 0; i < jumlah; i++) {
            Mahasiswa mhs = mahasiswaArr[i];
            System.out.printf("%-3d %-10s %-5d %-10s\n", (i + 1), mhs.nama, mhs.nilai, mhs.getStatus());
            totalNilai += mhs.nilai;
        }

        System.out.println("================================");
        System.out.printf("Jumlah: %.1f\n", totalNilai);
        System.out.printf("Nilai Rata-rata: %.1f\n", totalNilai / jumlah);

        input.close();
    }
}
