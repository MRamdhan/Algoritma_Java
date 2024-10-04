import java.util.Scanner;

public class MenentukanGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Menentukan Grade =====");

        System.out.print("Masukan Nilai Mahasiswa :");
        double nilaiMahasiswa = scanner.nextDouble();

        String grade;

        if (nilaiMahasiswa >= 85) {
            grade = "A";
        } else if (nilaiMahasiswa >= 75){
            grade = "B";
        } else if (nilaiMahasiswa >= 65){
            grade = "C";
        } else if (nilaiMahasiswa >= 55){
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Grade Mahasiswa : " + grade);
        scanner.close();
    }
}
