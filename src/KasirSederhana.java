import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Kasir Sederhana === ");
        System.out.print("Masukan jumlah barang yang dibeli : ");
        int jumlahBarang = scanner.nextInt();
        int totalHarga = 0;
        System.out.println("Ada " + jumlahBarang + " Barang yang harus input"); 

        for(int i = 1; i <=  jumlahBarang; i++) {
            System.out.print(i + ". Masukan Harga yang di beli : ");
            int harga = scanner.nextInt();
            totalHarga += harga;
        }

        System.out.println("Total Harga : " + totalHarga);
        System.out.print("Masukan Uang Bayar : ");
        int uangBayar = scanner.nextInt();

        if (uangBayar >= totalHarga) {
            int kembalian = uangBayar - totalHarga;
            System.out.println("Kembalian : " + kembalian); 
            System.out.println("Terimakasih Telah Berbelanja disini"); 
        } else {
            System.out.println("Maaf nominal kurang"); 
        }

        scanner.close();
    }
}
