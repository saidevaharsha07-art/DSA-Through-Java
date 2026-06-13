import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of values: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        int original = n;
        int sum = 0;
        if (n == 0) {
            System.out.println("It is an Armstrong Number.");
            sc.close();
            return;
        }
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        if (sum == original) {
            System.out.print("It is an Armstrong Number.");
        } else {
            System.out.print("It is not an Armstrong Number.");
        }
        sc.close();
    }
}