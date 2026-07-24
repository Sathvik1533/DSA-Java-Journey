package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 1. ARCHITECTURAL METADATA: Q13_Sort_Descending
 * Purpose: Organizing data in reverse order to handle highest-value greedy selection problems.
 */
public class _13_SortLargestToSmallest {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * Collections.sort(list, Collections.reverseOrder());
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(42, 7, 89, 12, 55, 3));
        Collections.sort(list, Collections.reverseOrder()); // Rearranges high to low
        System.out.println("Sorted largest to smallest: " + list);
    }
}
