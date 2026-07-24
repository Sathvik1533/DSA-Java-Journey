package ArrayListBasics;
import java.util.Arrays;
import java.util.List;

/**
 * 1. ARCHITECTURAL METADATA: Q10_Locked_List_Trap
 * Purpose: Trapping and explaining the exception error that happens when you try to change a locked, static list snapshot.
 */
public class _10_FixedListCrashTrap {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * List<Type> lockedList = Arrays.asList(item1, item2);
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        List<Integer> fixed = Arrays.asList(1, 2, 3);
        try {
            fixed.add(4); // ⚠️ Crucial Interview Trap: This will break!
        } catch (UnsupportedOperationException e) {
            System.out.println("Error intercepted: Arrays.asList makes a locked list that cannot change sizes.");
        }
    }
}
