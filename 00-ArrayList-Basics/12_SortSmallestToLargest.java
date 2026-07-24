package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 1. ARCHITECTURAL METADATA: Q12_Sort_Ascending
 * Purpose: Organizing messy inputs into sequential ascending order to activate quick pointer checks.
 */
public class _12_SortSmallestToLargest {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * Collections.sort(list);
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(42, 7, 89, 12, 55, 3));
        System.out.println("Before ordering: " + list);
        Collections.sort(list); // Rearranges low to high
        System.out.println("Sorted smallest to largest: " + list);
    }
}
