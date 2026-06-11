import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        int rev = 0;
        int sign = 1;
        if (n < 0) {
            sign = -1;
        }
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        rev = rev * sign;
        System.out.print("Reverse of a number is: " + rev);
        sc.close();
    }
}