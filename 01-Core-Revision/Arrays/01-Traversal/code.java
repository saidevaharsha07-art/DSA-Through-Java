public class code {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //Forward Traversal
        System.out.println("Forward Traversal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Reverse Traversal
        System.out.println("Reverse Traversal:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}