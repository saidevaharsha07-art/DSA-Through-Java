import java.util.Scanner;

public class Pat11 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            int num;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    num = 0;
                } else {
                    num = 1;
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    if (num == 0) {
                        num = 1;
                    } else {
                        num = 0;
                    }
                }
                System.out.println();
            }
        }
    }
}