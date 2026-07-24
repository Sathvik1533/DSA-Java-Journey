/* 
-----------------------------------------
Problem : Find Frequency of an Element
-----------------------------------------

Pattern : Traversal + Counting

-----------------------------------------
Approach : 
Initialize counter to 0
Traverse entire array
Increment counter when target element found

-----------------------------------------
Time Complexity : O(n)
-----------------------------------------
Space Complexity : O(1)
-----------------------------------------
*/

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40};
        int target = 10;
        int count = 0;
        
        // Count occurrences
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                count++;
            }
        }
        
        System.out.println("Frequency of " + target + " is: " + count);
    }
}
