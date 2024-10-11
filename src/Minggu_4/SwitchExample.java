package Minggu_4;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day, dayInEnglish = "";
        System.out.print("Masukkan nama hari: ");
        day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "senin":
                dayInEnglish = "Monday";
                break;
            case "selasa":
                dayInEnglish = "Tuesday"; 
                break;
            case "rabu":
                dayInEnglish = "Wednesday";
                break;
            case "kamis":
                dayInEnglish = "Thursday";
                break;
            case "jumat":
                dayInEnglish = "Friday";
                break;
            case "sabtu":
                dayInEnglish = "Saturday";
                break;
            case "minggu":
                dayInEnglish = "Sunday";
                break;
            default:
                dayInEnglish = "Invalid day";
                break;
        }

        System.out.println("Hari dalam bahasa Inggris: " + dayInEnglish);
        scanner.close();
    }
}
