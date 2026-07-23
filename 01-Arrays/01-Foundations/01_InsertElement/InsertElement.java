/* 
-----------------------------------------
Problem : Insert Element at Given Index
-----------------------------------------

Pattern : Movement Pattern

-----------------------------------------
Approach : 
Start from last occupied position
Shift every element one position right
Reach insertion index
Insert element
Increase logical size

-----------------------------------------
Time Complexity : O(n)
-----------------------------------------
Space Complexity : O(1)
-----------------------------------------
*/

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        
        int size = 4;
        int element = 25;
        int index = 2;
        
        // Shift elements to the right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Insert element at index
        arr[index] = element;
        size++;
        
        // Print array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
