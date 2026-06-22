package RecursiveFunctions;

import java.util.Scanner;

public class Factorial {
    public static int printFact(int n){
        if(n==1||n==0){
            return 1;
        }
        printFact(n-1);
        return n * printFact(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        System.out.println(printFact(n));
    }
}
