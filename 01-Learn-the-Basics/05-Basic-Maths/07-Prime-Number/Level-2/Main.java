import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("It is not a Prime Number.");
            sc.close();
            return;
        }
        boolean prime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("It is a Prime Number.");
        } else {
            System.out.println("It is not a Prime Number.");
        }
        sc.close();
    }
}