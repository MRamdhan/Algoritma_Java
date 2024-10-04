package Minggu3;
import java.util.Scanner;

public class Libur {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("===== Menanyakan Hari =====");

    System.out.print(" Masukan Hari :  ");
    String hari = scanner.nextLine();
    hari = hari.toLowerCase();

    if (hari.equals("sabtu") || hari.equals("minggu")) {
        System.out.println("Hari Libur");
    } else {
        System.out.println("Hari kerja");
    }

    scanner.close();
    }
}
