package Minggu_4;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        for (int i=20; i>=2; i-=3 ){
            System.out.print(i + " ");
        }
        System.out.println("2");

        System.out.println("==========");

        for (int x=5; x<=35; x+=5 ){
            System.out.print(x + " ");
        }
        System.out.println("35");

        System.out.println("==========");
        
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int c = 1; c <= 7; c++) {
            int total = a + c;
            System.out.print(total + " ");
            a = total;
        }   

        System.out.println("");
        System.out.println("==========");
        int q = 1, w = 1;
        System.out.print(q + " " + w + " ");
        for (int r = 1; r <= 7; r++) {
            int total = q + w;
            System.out.print(total + " ");
            int nilai = w;
            w = total;
            q = nilai;
        }

        System.out.println();
        System.out.println("=========");

        a = 0;
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
        System.out.println("=========");    
        System.out.println("=====QUIZ=====");   
        
        for(int i = 2; i <= 5; i++) {
            for(int j = 2; j <= 5; j++) {
                if(i == j) {
                System.out.println(i + "x" + j + " = " + (i*j));
            }
        }
    }   
    }
}