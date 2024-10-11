package Latihan;

public class ratarata {
    public static void main(String[] args) {
        // Data laba bersih harian
        int[] data = {
            8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 12, 12, 13, 13, 14, 14, 14, 14, 14,
            15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 17, 17, 17, 17, 18, 18, 18, 18,
            19, 19, 19, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 23, 23,
            23, 23, 23, 24, 24, 24, 24, 25, 25, 26, 26, 27, 28, 30, 31, 32, 35, 35,
            35, 36, 36, 36, 37
        };

        // Menghitung rata-rata laba bersih per hari
        int total = 0;  // Jumlahkan semua nilai
        for (int nilai : data) {
            total += nilai;
        }
        int jumlahData = data.length;  // Hitung jumlah data
        double rataRata = (double) total / jumlahData;  // Hitung rata-rata

        // Mencetak hasil
        System.out.println("Rata-rata laba bersih per hari adalah: " + rataRata);
        System.out.println("Rata-rata laba bersih per hari adalah: " + jumlahData);
        System.out.println("Rata-rata laba bersih per hari adalah: " + total);
    }
}