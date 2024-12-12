package UTS;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Gaji Pokok Bulanan : ");
        double gaji = scanner.nextDouble();

        System.out.print("Masukan Jam Lembur : ");
        int jamLembur = scanner.nextInt();

        double upahLemburPerJam = gaji / 150;
        double totalUpahLembur;

        if (jamLembur > 5) {
            totalUpahLembur = (5 * upahLemburPerJam) + ((jamLembur - 5) * 1.5 *upahLemburPerJam);
        } else{
            totalUpahLembur = jamLembur * upahLemburPerJam;
        }

        double totalGaji = gaji + totalUpahLembur;

        System.out.println("Upah Lembur perjam : " + (int) upahLemburPerJam);
        System.out.println("Total Gaji : " + (int)totalGaji);
        
        scanner.close();
    }
}
