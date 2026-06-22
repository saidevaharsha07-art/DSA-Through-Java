import java.util.*;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number : ");
        int n = sc.nextInt();
        int decimal = 0;
        int place = 1;
        while (n > 0) {
            int rem = n % 10;
            decimal = decimal + (rem * place);
            place = place * 2;
            n = n / 10;
        }
        System.out.println("Decimal Number : " + decimal);
    }
}