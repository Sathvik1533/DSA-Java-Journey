package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. ARCHITECTURAL METADATA: Q04_Delete_Last
 * Purpose: Instantly dropping the very last item of the list—essential for reversing backtracking decisions.
 */
public class _04_DeleteLastItem {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * list.remove(list.size() - 1);
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println("Before deleting last: " + list);
        list.remove(list.size() - 1); // Finds the last position dynamically and removes it
        System.out.println("After deleting last: " + list);
    }
}
