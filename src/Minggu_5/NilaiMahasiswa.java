package Minggu_5;
import java.util.Scanner;
import java.util.Locale;

class taskMahasiswa{
    String nama;
    double nilai;

    taskMahasiswa(String nama, double nilai){
        this.nama = nama;
        this.nilai = nilai;
    }

    String getStatus(){
        if (nilai >= 60) {
            return "Lulus";
        } else{
            return "Tidak Lulus";
        }
    }

    String getGrade(){
        if (nilai >= 85) {
            return "A";
        } if (nilai >= 75) {
            return "B";
        } if (nilai >= 65) {
            return "C";
        } else {
            return "D";
        }
    }
}

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Masukan jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        taskMahasiswa[] mahasiswas = new taskMahasiswa[jumlahData];
        for(int i = 0; i < jumlahData; i++){
            System.out.println("Mahasiswa ke : " + (i +1));
            System.out.print("Masukan nama mahasiswa : ");
            String nama = scanner.nextLine();
            System.out.print("Masukan nilai : ");
            double nilai = scanner.nextDouble();
            scanner.nextLine();
            
            mahasiswas[i] = new taskMahasiswa(nama, nilai);
            System.out.println("--------------------");
        }

        System.out.println("Data nilai mahasiswa : ");
        System.out.println("==============================");
        System.out.printf("%-3s %-10s %-5s %-3s %-10s\n",
                        "No", "Nama", "Nilai", "Grade", "Status");
        double totalNilai = 0;
        for(int i=0; i <jumlahData; i++){
            taskMahasiswa mhs = mahasiswas[i];
            System.out.printf("%-3d %-10s %-6.1f %-3s %-10s\n",(i+1),mhs.nama,mhs.nilai,mhs.getGrade(),mhs.getStatus());
            totalNilai += mhs.nilai;
        }
        System.out.println("==============================");
        System.out.printf("Jumlah : %.1f\n", totalNilai);
        double rataRata = totalNilai / jumlahData;
        System.out.printf("Nilai rata-rata : %.1f\n", rataRata);
        System.out.println("--------------------");
        scanner.close();
    }
}
