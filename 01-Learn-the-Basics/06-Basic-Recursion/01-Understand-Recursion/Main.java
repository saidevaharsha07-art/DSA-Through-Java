import java.util.Scanner;

public class Main {
    static void printName(int count, int n) {
        if (count > n) {
            return;
        }
        System.out.println("Harsha");
        printName(count + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        printName(1, n);
    }
}