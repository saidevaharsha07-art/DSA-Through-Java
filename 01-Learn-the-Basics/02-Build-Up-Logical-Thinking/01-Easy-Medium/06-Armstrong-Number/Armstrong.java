import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        // Count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = n;
        int sum = 0;

        // Calculate Armstrong sum
        while (temp > 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, count);
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}