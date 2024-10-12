package Minggu_4;

public class LoopAnggkaV3 {
    public static void main(String[] args) {
        for(int x = 0; x < 4; x++){
            for(int y = 0; y < 5; y++){
                if ((x + y) % 2 == 0) {
                    System.out.print("-1 "); //Genap
                } else {
                    System.out.print(" 0 ");  //Ganjil
                }
            }
            System.out.println();
        }
    }
}
