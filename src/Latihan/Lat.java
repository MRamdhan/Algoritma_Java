package Latihan;

public class Lat {
    public static void main(String[] args) {
        System.out.println("Fibonacci ke-7: " + fibonacci(7));

        System.out.println("prtin mundur dari 5: ");
        printReverse(5);
        System.out.println();

        String str = "madam";
        System.out.println("Apakah '" + str + "' palindrom? " + isPalindrome(str, 0, str.length() - 1));
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Apakah 3 ada di array? " + contains(arr, arr.length, 3));
    }
    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void printReverse(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printReverse(n - 1);
    }

    public static boolean isPalindrome(String str,int start,int end){
        if (start == end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static boolean contains(int[] arr, int n, int target) {
        if (n == 0) {
            return false;
        }
        if (arr[n - 1] == target) {
            return true;
        }
        return contains(arr, n - 1, target);
    }
}

