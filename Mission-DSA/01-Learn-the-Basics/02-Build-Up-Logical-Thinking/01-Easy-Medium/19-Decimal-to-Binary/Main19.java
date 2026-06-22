import java.util.*;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        int n = sc.nextInt();
        int binary = 0;
        int place = 1;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * place);
            place = place * 10;
            n = n / 2;
        }
        System.out.println("Binary Number : " + binary);
    }
}