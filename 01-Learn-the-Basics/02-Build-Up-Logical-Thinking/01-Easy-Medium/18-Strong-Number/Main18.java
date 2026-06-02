import java.util.*;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is a Strong Number.");
        } else {
            System.out.println(temp + " is not a Strong Number.");
        }
    }
}