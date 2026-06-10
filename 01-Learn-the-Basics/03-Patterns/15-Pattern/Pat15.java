import java.util.Scanner;

public class Pat15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();

            for (int i = n; i >= 1; i--) {
                char ch = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println();
            }
        }
    }
}