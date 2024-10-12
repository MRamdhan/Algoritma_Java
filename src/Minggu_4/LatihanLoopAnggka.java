package Minggu_4;

public class LatihanLoopAnggka {
    public static void main(String[] args) {
        System.out.println("=========");

        int a = 0;
        for(int p = 0; p < 5; p++ ){
                for(int j = 0; j < 5; j+=1){
                    System.out.print(a +" ");
                    a+= 1;
                }
                System.out.println();
            }
            
        System.out.println("=========");
                a = 24; 
        for(int p = 0; p < 5; p++ ){
            for(int j = 0; j < 5; j+=1){
                System.out.print(a +" ");
                a-= 1;
            }
            System.out.println();
        }
    }
}
