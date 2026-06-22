import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;
        int min = Math.min(a, b);
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        System.out.print("GCD of "+a+" and "+b+" is :"+gcd);
        
        sc.close();
    }
}