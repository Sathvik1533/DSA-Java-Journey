/* 
-----------------------------------------
Problem : Left Rotate Array by One Position
-----------------------------------------

Pattern : Rotation Pattern

-----------------------------------------
Approach : 
Store first element in temp
Shift all elements one position left
Place temp at last position

-----------------------------------------
Time Complexity : O(n)
-----------------------------------------
Space Complexity : O(1)
-----------------------------------------
*/

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;
        
        // Store first element
        int temp = arr[0];
        
        // Shift left
        for(int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        // Place first at last
        arr[size - 1] = temp;
        
        // Print array
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
