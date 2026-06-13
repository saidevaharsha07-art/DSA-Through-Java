import java.util.Scanner;

public class Main {
    static void printNumbers(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNumbers(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        printNumbers(1, n);
    }
}