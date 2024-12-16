package Minggu_11;

public class JumpSearch {
    public static void main(String[] args) {
        int[] array = {
            1,3,5,7,9,11,13,15,17,19
        };
        int x = 20;
        int n = array.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;
        
        while(array[Math.min(step, n) - 1] < x){
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                System.out.println("Nilai tidak ditemukan!");
                return;
            }
        }
        for(int i = prev; i < Math.min(step, n); i++){
            if (array[i] == x) {
                System.out.println("Nilai ditemukan pada index ke-" + i);
                return;
            }
        }
        System.out.println("Nilai tidak ditemukan!");
    }
}