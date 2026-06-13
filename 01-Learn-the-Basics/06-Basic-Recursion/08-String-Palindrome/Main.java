import java.util.Scanner;

public class Main {

    static boolean palindrome(String s, int i) {

        if (i >= s.length() / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return palindrome(s, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = sc.next();

        if (palindrome(s, 0)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}