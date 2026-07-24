package ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. ARCHITECTURAL METADATA: Q03_Size_Growth
 * Purpose: Monitoring how the internal item count changes when you push more data in.
 */
public class _03_CheckSizeGrowth {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * int currentCount = list.size();
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println("Size before adding: " + list.size());
        for (int i = 1; i <= 5; i++) {
            list.add(i * 100);
        }
        System.out.println("Size after adding: " + list.size());
    }
}
