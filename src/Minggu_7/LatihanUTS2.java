package Minggu_7;
import java.util.Scanner;

public class LatihanUTS2 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if (j < 3 - i ) {
                    System.out.print(" S ");
                } else{
                    System.out.print(" O ");
                }
            }
            System.out.println ();
        }
    }
}