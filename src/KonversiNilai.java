import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Konversi Nilai Menjadi Grade === ");
        

        double persenAbsen = 0.10; 
        double persenTugas = 0.20; 
        double persenProject = 0.25; 
        double persenQuiz = 0.5;  
        double persenUts = 0.20;   
        double persenUas = 0.20;   
        
        System.out.print("Masukkan Nama Mahasiswa : ");
        String namaMahasiswa = scanner.nextLine();
        
        System.out.print("Masukkan nilai absen : ");
        double nilaiAbsen = scanner.nextDouble();

        System.out.print("Masukkan nilai tugas : ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai project : ");
        double nilaiProject = scanner.nextDouble();

        System.out.print("Masukkan nilai quiz : ");
        double nilaiQuiz = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UTS : ");
        double nilaiUts = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UAS : ");
        double nilaiUas = scanner.nextDouble();
        
        double nilaiAkhir = (nilaiAbsen * persenAbsen) +
                            (nilaiTugas * persenTugas) +
                            (nilaiProject * persenProject) +
                            (nilaiQuiz * persenQuiz) +
                            (nilaiUts * persenUts) +
                            (nilaiUas * persenUas);
        
        String grade;
        String keterangan;
        
        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        if (nilaiAkhir >= 85) {
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 75) {
            keterangan = "Lukus";
        } else if (nilaiAkhir >= 65) {
            keterangan = "Remedial";
        } else if (nilaiAkhir >= 55) {
            keterangan = "Tidak lulus";
        } else {
            keterangan = "Tidak lulus";
        }
        
        System.out.println(" === Kesimpulan === ");

        System.out.println("Nama mahasiswa : " + namaMahasiswa);
        System.out.println("Nilai akhir mahasiswa : " + nilaiAkhir);
        System.out.println("Grade mahasiswa : " + grade);
        System.out.println("Keterangan : " + keterangan);
        
        scanner.close();
    }
}
