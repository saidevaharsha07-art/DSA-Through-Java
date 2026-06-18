public class Main {
    public static int largestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        System.out.println("Largest Element: " + largestElement(arr));
    }
}