package Minggu_5;

public class soalLatihan {
    //  S S S O
    //  S S O O
    //  S O O O
    //  O O O O
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3 - i) {
                    System.out.print("S ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
