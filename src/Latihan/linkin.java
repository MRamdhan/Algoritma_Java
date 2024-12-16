package Latihan;
import java.util.LinkedList;

public class linkin {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);

        list3.add(6);
        list3.add(7);
        list3.add(8);
        list3.add(9);

        int length1 = list1.size();
        int length2 = list2.size();
        int length3 = list3.size();

        if (length1 == length2 && length2 == length3) {
            System.out.println("Semua Linked List memiliki panjang yang sama.");
            System.out.println("List 1: " + list1);
            System.out.println("List 2: " + list2);
            System.out.println("List 3: " + list3);
        } else {
            if (length1 >= length2 && length1 >= length3) {
                System.out.println("Linked List 1 adalah yang paling panjang: " + list1);
            } else if (length2 >= length1 && length2 >= length3) {
                System.out.println("Linked List 2 adalah yang paling panjang: " + list2);
            } else {
                System.out.println("Linked List 3 adalah yang paling panjang: " + list3);
            }
        }
    }
}
