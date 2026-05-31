import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += (digit * digit * digit);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.print("It is an Armstrong Number.");
        } else {
            System.out.print("It is not a Armstrong Number.");
        }
    }
}