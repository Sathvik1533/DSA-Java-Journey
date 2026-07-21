public class FirstHalf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        
        System.out.println("First half of the array:");
        // Print first half of the array
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
