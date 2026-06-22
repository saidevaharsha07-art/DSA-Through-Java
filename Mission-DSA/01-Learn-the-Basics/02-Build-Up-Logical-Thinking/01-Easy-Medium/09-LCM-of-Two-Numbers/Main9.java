import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int num1 = a;
        int num2 = b;
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int lcm = (num1 * num2) / a;
        System.out.print("LCM :" + lcm);
    }
}