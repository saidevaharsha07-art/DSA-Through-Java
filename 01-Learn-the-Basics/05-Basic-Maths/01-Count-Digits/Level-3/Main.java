import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Digits: 1");
        } else {
            n = Math.abs(n);
            int digits = (int) (Math.log10(n)) + 1;
            System.out.println("Digits: " + digits);
        }
        sc.close();
    }
}