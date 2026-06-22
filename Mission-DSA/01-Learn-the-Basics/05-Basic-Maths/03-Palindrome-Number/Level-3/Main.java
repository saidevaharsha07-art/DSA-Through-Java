import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;

        if (n < 0) {
            System.out.println("It is not a Palindrome");
            sc.close();
            return;
        } else if (n % 10 == 0 && n != 0) {
            System.out.println("It is not a Palindrome");
            sc.close();
            return;
        }
        while (n > rev) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (n == rev || n == rev / 10) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
        sc.close();
    }
}