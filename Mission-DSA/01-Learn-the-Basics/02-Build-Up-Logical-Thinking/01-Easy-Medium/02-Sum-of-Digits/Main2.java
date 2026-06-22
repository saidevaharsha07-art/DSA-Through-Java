import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }
            System.out.println("Sum of this number is: " + sum);
        }
    }
}