import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;

        if (n < 0) {
            System.out.println("It is not a Palindrome");
            sc.close();
            return;
        } else if (n % 10 == 0 && n != 0) {
            System.out.println("It is not a Palindrome");
            sc.close();
            return;
        }
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.print("It is a Pallindrome.");
        } else {
            System.out.print("It is not a Pallindrome.");
        }
        sc.close();
    }
}