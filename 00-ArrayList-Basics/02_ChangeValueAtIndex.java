package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. ARCHITECTURAL METADATA: Q02_Change_Value
 * Purpose: Overwriting a piece of data at an exact location without modifying surrounding items.
 */
public class _02_ChangeValueAtIndex {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * list.set(position, newValue);
         * DataType item = list.get(position);
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        list.set(3, 999); // Changes the 4th item (index 3) to 999
        System.out.println("Verified position 3 change: " + list.get(3));
    }
}
