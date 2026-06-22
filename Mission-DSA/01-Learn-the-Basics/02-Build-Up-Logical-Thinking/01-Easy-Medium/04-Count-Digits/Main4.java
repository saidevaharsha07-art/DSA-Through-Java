import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 0) {
            System.out.print("1");
        } else {
            while (n > 0) {
                n = n / 10;
                count += 1;
            }
            System.out.println("Number of digits:" + count);
        }
    }
}