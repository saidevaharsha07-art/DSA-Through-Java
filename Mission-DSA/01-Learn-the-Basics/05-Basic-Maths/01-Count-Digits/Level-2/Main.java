import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Digits: 1");
            sc.close();
            return;
        }
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println("Digits: " + count);

        sc.close();
    }
}