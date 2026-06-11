import java.util.*;

public class Main {
    static boolean isArmstrong(int n) {
        int temp = n;
        int original = n;
        int count = 0;
        int sum = 0;
        if (n == 0) {
            return true;
        }
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to start: ");
        int start = sc.nextInt();
        System.out.print("Enter a number to end: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}