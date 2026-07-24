/* 
-----------------------------------------
Problem : Find Duplicate Elements (Brute Force)
-----------------------------------------

Pattern : Unique Pair Comparison

-----------------------------------------
Approach : 
Compare every element with every other element
Use nested loops to generate all unique pairs
When match found, print the duplicate

-----------------------------------------
Time Complexity : O(n²)
-----------------------------------------
Space Complexity : O(1)
-----------------------------------------
*/

public class FindDuplicatesBrute {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 20};
        
        System.out.println("Duplicate elements:");
        
        // Compare every pair
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Avoid printing same duplicate multiple times
                }
            }
        }
    }
}
