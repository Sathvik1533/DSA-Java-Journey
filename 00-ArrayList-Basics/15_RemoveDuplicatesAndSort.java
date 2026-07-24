package ArrayListBasics;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 1. ARCHITECTURAL METADATA: Q15_Full_Process
 * Purpose: The combo challenge—simulating an entry stream, stripping away duplicate values with .contains(), and sorting the final output.
 */
public class _15_RemoveDuplicatesAndSort {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * if (!tracker.contains(element)) { tracker.add(element); }
         * Collections.sort(tracker);
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        int[] inputDataStream = {15, 32, 15, 8, 32, 90, 8, -1};
        ArrayList<Integer> collectedList = new ArrayList<>();
        
        for (int value : inputDataStream) {
            if (value == -1) break; // End of tracking sequence marker
            collectedList.add(value);
        }
        
        ArrayList<Integer> uniqueItemsOnly = new ArrayList<>();
        for (int i = 0; i < collectedList.size(); i++) {
            int currentNum = collectedList.get(i);
            // Uses .contains() to make sure we don't save duplicates
            if (!uniqueItemsOnly.contains(currentNum)) {
                uniqueItemsOnly.add(currentNum);
            }
        }
        
        Collections.sort(uniqueItemsOnly); // Sorts our final clean list
        System.out.println("Final clean, filtered and sorted list: " + uniqueItemsOnly);
    }
}
