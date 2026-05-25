import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Example size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int TotalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            TotalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = TotalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                System.out.println("Pivot Index: " + i);
            }
            leftSum += arr[i];
        }
        System.out.println(-1); // If no pivot index is found
    }
}