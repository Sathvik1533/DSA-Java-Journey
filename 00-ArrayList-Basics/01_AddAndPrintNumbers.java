package ArrayListBasics;
import java.util.ArrayList;

/**
 * 1. ARCHITECTURAL METADATA: Q01_Add_And_Print
 * Purpose: Adding elements to a list one after another and using a loop to display them all.
 */
public class _01_AddAndPrintNumbers {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * list.add(value);
         * for(int i=0; i < list.size(); i++) { list.get(i); }
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10) {
            list.add(i); 
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Item at position " + i + " is: " + list.get(i));
        }
    }
}
