public class PrintFirstHalfReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        
        System.out.println("First half in reverse:");
        // Print first half of the array in reverse order
        int mid = arr.length / 2;
        for (int i = mid - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
