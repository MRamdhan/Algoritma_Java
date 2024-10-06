package Minggu_3;

import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double diskon1 = 5.0/100.0; //belanja di atas 50k
        double diskon2 = 10.0/100.0; //belanja di atas 100k
        double diskon3 = 15.0/100.0; //belanja di atas 200k
        double hasil; 

        System.out.println("===== Diskon Belanjaan =====");
        System.out.print("appakah anda punya member ");
        String member = scanner.nextLine();
        member = member.toLowerCase();

        System.out.print("Masukan total belanja: ");
        double totalBelanja = scanner.nextDouble();
        
        if (totalBelanja >= 200000) {
            hasil = diskon3*totalBelanja;
            totalBelanja -= hasil;
            System.out.println("Anda mendapatkan diskon 15% : " + totalBelanja);
            if (member.equals("y")) {
                hasil = 10.0/100*totalBelanja;
                totalBelanja -= hasil;
                System.out.println("Anda mendapatkan diskon 15% + diskon member : " + totalBelanja);
            } else if (member.equals("n")) {
                System.out.println("Total belanja: " + totalBelanja);
            }
        } else if (totalBelanja >= 100000) {
            hasil = diskon2*totalBelanja;
            totalBelanja -= hasil;
            System.out.println("Anda mendapatkan diskon 10% : " + totalBelanja);
            if (member.equals("y")) {
                hasil = 10.0/100*totalBelanja;
                totalBelanja -= hasil;
                System.out.println("Anda mendapatkan diskon 10% + diskon member : " + totalBelanja);
            } else if (member.equals("n")) {
                System.out.println("Total belanja: " + totalBelanja);
            }
        } else if (totalBelanja >=50000) {
            hasil = diskon1*totalBelanja;
            totalBelanja -= hasil;
            System.out.println("Anda mendapatkan diskon 5% : " + totalBelanja);
            if (member.equals("y")) {
                hasil = 10.0/100*totalBelanja;
                totalBelanja -= hasil;
                System.out.println("Anda mendapatkan diskon 5% + diskon member : " + totalBelanja);
            } else if (member.equals("n")) {
                System.out.println("Total belanja: " + totalBelanja);
            }
        } else{
            hasil = 0.0;
            totalBelanja -= hasil;
            if (member.equals("y")) {
                hasil = 10.0/100*totalBelanja;
                totalBelanja -= hasil;
                System.out.println("Anda mendapatkan diskon member : " + totalBelanja);
            } else if (member.equals("n")) {
                System.out.println("Total belanja: " + totalBelanja);
            }
        }
        scanner.close();
    }
}