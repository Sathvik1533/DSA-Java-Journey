package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. ARCHITECTURAL METADATA: Q14_Combine_Lists
 * Purpose: Gluing an entire separate collection directly onto the end of your original list in one fast operation.
 */
public class _14_CombineTwoLists {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * mainList.addAll(secondaryList);
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> groupA = new ArrayList<>(Arrays.asList(10, 20));
        ArrayList<Integer> groupB = new ArrayList<>(Arrays.asList(30, 40, 50));
        groupA.addAll(groupB); // Glues groupB onto groupA
        System.out.println("Combined data: " + groupA + " | Final count: " + groupA.size());
    }
}
