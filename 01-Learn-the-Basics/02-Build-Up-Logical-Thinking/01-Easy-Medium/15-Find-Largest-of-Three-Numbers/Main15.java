import java.util.*;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Value : ");
        int a = sc.nextInt();
        System.out.print("Enter B Value : ");
        int b = sc.nextInt();
        System.out.print("Enter C Value : ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is largest. ");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest. ");
        } else {
            System.out.println(c + " is largest. ");
        }
    }
}