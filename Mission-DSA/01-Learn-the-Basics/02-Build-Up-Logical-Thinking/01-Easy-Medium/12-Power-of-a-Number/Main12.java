import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Number :");
        int base = sc.nextInt();
        System.out.print("Enter Power Number :");
        int power = sc.nextInt();
        int result = 1;
        System.out.println("Power of a Number is :");
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}