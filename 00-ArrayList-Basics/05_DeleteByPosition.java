package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. ARCHITECTURAL METADATA: Q05_Delete_By_Position
 * Purpose: Dropping an item using its numeric index location, which forces all right-side items to slide left.
 */
public class _05_DeleteByPosition {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * DataType item = list.remove(indexNumber);
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int deletedItem = list.remove(2); // Deletes index 2 (the number 30)
        System.out.println("Removed item was: " + deletedItem);
        System.out.println("List after item shifted: " + list);
    }
}
