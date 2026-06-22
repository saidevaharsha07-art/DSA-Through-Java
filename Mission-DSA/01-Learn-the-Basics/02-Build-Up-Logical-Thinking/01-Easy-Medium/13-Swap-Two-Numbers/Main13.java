import java.util.*;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Value : ");
        int a = sc.nextInt();
        System.out.print("Enter B Value : ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println(" After Swapping : ");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);
    }
}