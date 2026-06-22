import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
                if (i != n / i) {
                    System.out.print(n / i + " ");
                    count++;
                    sum += n / i;
                }
            }
        }
        System.out.println();
        System.out.println("Count : " + count);
        System.out.println("Sum : " + sum);
    }
}