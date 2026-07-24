package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. ARCHITECTURAL METADATA: Q11_Make_Flexible
 * Purpose: Taking a locked list and wrapping it in a brand new heap object allocation to make it expandable.
 */
public class _11_ConvertFixedToFlexible {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * ArrayList<Type> flexible = new ArrayList<>(Arrays.asList(data));
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> fullyFlexibleList = new ArrayList<>(Arrays.asList(1, 2, 3));
        fullyFlexibleList.add(4); // Works flawlessly now!
        System.out.println("Flexible copy output: " + fullyFlexibleList);
    }
}
