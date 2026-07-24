/* 
-----------------------------------------
Problem : Check if Array is Sorted
-----------------------------------------

Pattern : Adjacent Comparison Pattern

-----------------------------------------
Approach : 
Compare each element with next element
If any element is greater than next, not sorted
If all comparisons pass, array is sorted

-----------------------------------------
Time Complexity : O(n)
-----------------------------------------
Space Complexity : O(1)
-----------------------------------------
*/

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean isSorted = true;
        
        // Check adjacent elements
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        
        System.out.println(isSorted ? "Sorted" : "Not Sorted");
    }
}
