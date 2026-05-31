import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.print(n + " is not a prime number.");
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(n + " is not a prime number.");
                    return;
                }
            }
            System.out.print(n + " is a prime number.");
        }
    }
}