package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. ARCHITECTURAL METADATA: Q08_Wipe_List
 * Purpose: Wiping out all data inside the tracker instantly to reset your workspace.
 */
public class _08_WipeListCompletely {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * list.clear();
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 14, 21));
        list.clear(); // Wipes it back down to an empty bracket []
        System.out.println("Wiped status: Is Empty = " + list.isEmpty() + ", Count = " + list.size());
    }
}
