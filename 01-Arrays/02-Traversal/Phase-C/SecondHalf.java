public class SecondHalf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        
        System.out.println("Second half of the array:");
        // Print second half of the array
        int mid = arr.length / 2;
        for (int i = mid; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
