/* 
-----------------------------------------
Problem : Right Rotate Array by One Position
-----------------------------------------

Pattern : Rotation Pattern

-----------------------------------------
Approach : 
Store last element in temp
Shift all elements one position right
Place temp at first position

-----------------------------------------
Time Complexity : O(n)
-----------------------------------------
Space Complexity : O(1)
-----------------------------------------
*/

public class RightRotateByOne {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;
        
        // Store last element
        int temp = arr[size - 1];
        
        // Shift right
        for(int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Place last at first
        arr[0] = temp;
        
        // Print array
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
