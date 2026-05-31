import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if (temp == rev) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It not a Palindrome.");
        }
    }
}