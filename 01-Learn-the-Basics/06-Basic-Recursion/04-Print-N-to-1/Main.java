import java.util.Scanner;

public class Main {
    static void printNumbers(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}