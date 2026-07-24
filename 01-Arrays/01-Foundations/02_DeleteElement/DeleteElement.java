/* 
-----------------------------------------
Problem : Delete Element at Given Index
-----------------------------------------

Pattern : Movement Pattern

-----------------------------------------
Approach : 
Start from deletion index
Shift every element one position left
Decrease logical size

-----------------------------------------
Time Complexity : O(n)
-----------------------------------------
Space Complexity : O(1)
-----------------------------------------
*/

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;
        int index = 2;
        
        // Shift elements to the left
        for(int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        // Decrease size
        size--;
        
        // Print array
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
