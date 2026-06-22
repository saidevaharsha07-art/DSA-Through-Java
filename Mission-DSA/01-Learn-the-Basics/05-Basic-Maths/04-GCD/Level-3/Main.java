import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of values: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans = gcd(ans, arr[i]);
        }
        System.out.print("Output :" + ans);
        sc.close();
    }
}