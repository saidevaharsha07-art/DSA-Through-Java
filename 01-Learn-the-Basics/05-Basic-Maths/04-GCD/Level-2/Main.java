import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp1 = a;
        int temp2 = b;
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.print("GCD of " + temp1 + " and " + temp2 + " is :" + a);

        sc.close();
    }
}