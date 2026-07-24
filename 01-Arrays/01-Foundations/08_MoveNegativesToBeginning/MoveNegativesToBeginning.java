/* 
-----------------------------------------
Problem : Move All Negative Numbers to Beginning
-----------------------------------------

Pattern : Swap + Partition

-----------------------------------------
Approach : 
Use left pointer starting at index 0
Traverse array with another pointer
When negative number found, swap with left pointer position
Increment left pointer after each swap

-----------------------------------------
Time Complexity : O(n)
-----------------------------------------
Space Complexity : O(1)
-----------------------------------------
*/

public class MoveNegativesToBeginning {
    public static void main(String[] args) {
        int[] arr = {10, -2, 30, -5, 40, -1};
        int left = 0;
        
        // Partition array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                // Swap
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }
        
        // Print array
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
