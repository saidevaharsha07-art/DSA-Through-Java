import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int fact = 1;
        System.out.println("Factorial :");
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}