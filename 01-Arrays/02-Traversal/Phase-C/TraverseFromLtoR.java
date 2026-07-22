public class TraverseFromLtoR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int L = 2;  // Starting index (inclusive)
        int R = 6;  // Ending index (inclusive)
        
        System.out.println("Elements from index " + L + " to " + R + ":");
        // Traverse from L to R
        for (int i = L; i <= R && i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
