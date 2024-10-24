package Minggu_5;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

class latihan {
    String nama;
    double nilai;

    latihan(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    String getStatus() {
        if (nilai >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    String getGrade() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else {
            return "D";
        }
    }
}

public class lat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukan jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        ArrayList<latihan> lat = new ArrayList<>();

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Mahasiswa ke : " + (i + 1));
            System.out.print("Masukan nama mahasiswa : ");
            String nama = scanner.nextLine();
            System.out.print("Masukan nilai : ");
            double nilai = scanner.nextDouble();
            scanner.nextLine();

            lat.add(new latihan(nama, nilai));
            System.out.println("--------------------");
        }

        System.out.println("Data nilai mahasiswa : ");
        System.out.println("==============================");
        System.out.printf("%-3s %-10s %-5s %-3s %-10s\n",
                "No", "Nama", "Nilai", "Grade", "Status");

        double totalNilai = 0;
        for (int i = 0; i < lat.size(); i++) {
            latihan lth = lat.get(i);
            System.out.printf("%-3d %-10s %-6.1f %-3s %-10s\n",
                    (i + 1), lth.nama, lth.nilai, lth.getGrade(), lth.getStatus());
            totalNilai += lth.nilai;
        }

        System.out.println("==============================");
        System.out.printf("Jumlah : %.1f\n", totalNilai);
        double rataRata = totalNilai / jumlahData;
        System.out.printf("Nilai rata-rata : %.1f\n", rataRata);
        System.out.println("--------------------");
        scanner.close();
    }
}