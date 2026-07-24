package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. ARCHITECTURAL METADATA: Q06_Delete_By_Value
 * Purpose: Telling Java to scan the list and remove an explicit match of the number itself, instead of a location index.
 */
public class _06_DeleteByActualValue {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * list.remove(Integer.valueOf(literalValueToMatch));
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 2, 8, 2));
        System.out.println("Original list: " + list);
        
        // Forces Java to look for the literal number 2, not position 2
        list.remove(Integer.valueOf(2)); 
        
        System.out.println("After deleting first value 2: " + list);
    }
}
