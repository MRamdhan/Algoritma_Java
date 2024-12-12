package UTS;
import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    String nama;
    int sks;
    String grade;
    int bobot;

    public MataKuliah(String nama, int sks, String grade) {
        this.nama = nama;
        this.sks = sks;
        this.grade = grade;
        this.bobot = konversinilai(grade);
    }

    int konversinilai(String grade) {
        switch (grade.toUpperCase()) {
            case "A": return 4;
            case "B": return 3;
            case "C": return 2;
            case "D": return 1;
            case "E": return 0;
            default: return 0;
        }
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine();

        ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();

        System.out.println("Daftar Mata Kuliah:");
        
        while (true) {
            System.out.print("Nama Mata Kuliah (ketik 'y' jika ingin berhenti): ");
            String namaMataKuliah = scanner.nextLine();

            if (namaMataKuliah.equalsIgnoreCase("y")) {
                break;
            }

            System.out.print("Jumlah SKS: ");
            int sks = scanner.nextInt();

            System.out.print("grade (A, B, C, D, atau E): ");
            String grade = scanner.next();
            scanner.nextLine();

            daftarMataKuliah.add(new MataKuliah(namaMataKuliah, sks, grade));
        }

        int totalSKS = 0;
        double totalNilai = 0;

        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Semester : " + semester);
        System.out.println("================================================");
        System.out.printf("%-20s %-5s %-7s %-5s\n", 
                            "Mata Kuliah", "SKS","grade","Bobot" );
        System.out.println("------------------------------------------");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.printf("%-20s %-5d %-7s %-5s\n", 
                                    mk.nama, mk.sks, mk.grade, mk.bobot);
            totalSKS += mk.sks;
            totalNilai += mk.sks * mk.bobot;
        }

        double rataRataNilai = totalNilai / totalSKS;

        System.out.println("------------------------------------------");
        System.out.println("Total SKS yang diambil: " + totalSKS);
        System.out.printf("grade rata-rata: %.2f\n", rataRataNilai);
        System.out.println("================================================");

        scanner.close();
    }
}