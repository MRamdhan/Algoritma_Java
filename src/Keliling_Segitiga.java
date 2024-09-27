import java.util.Scanner;

public class Keliling_Segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Menghitung Keliling Segitiga =====");
        
        System.out.print("Masukkan panjang sisi 1 : ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan panjang sisi 2 : ");
        int b = scanner.nextInt();
        
        System.out.print("Masukkan panjang sisi 3 : ");
        int c = scanner.nextInt();
        
        if (a > 0 && b > 0 && c > 0 ) {
            int keliling = a + b + c;
            System.out.println("Keliling Segitiga : " + keliling);
        } else {
            System.out.println("Sisi-sisi harus berupa bilangan positif.");
        }
        
        scanner.close();
    }
}
