public class PrintEvenSecondHalfReverse {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        
        System.out.println("Even elements from second half in reverse:");
        // Print even elements from second half in reverse order
        int mid = arr.length / 2;
        for (int i = arr.length - 1; i >= mid; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
