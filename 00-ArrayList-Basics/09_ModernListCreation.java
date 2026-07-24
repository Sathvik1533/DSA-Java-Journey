package ArrayListBasics;
import java.util.ArrayList;

/**
 * 1. ARCHITECTURAL METADATA: Q09_Creation_Styles
 * Purpose: Comparing old-fashioned type definitions against modern, clean diamond brackets.
 */
public class _09_ModernListCreation {
    public static void main(String[] args) {
        /* 2. REUSABLE METHOD TEMPLATE
         * ArrayList<Type> cleanStyle = new ArrayList<>();
         */
        
        // 3. CORE ALGORITHMIC LOGIC
        ArrayList<Integer> oldStyle = new ArrayList<Integer>(); // Redundant type assignment
        ArrayList<Integer> diamondStyle = new ArrayList<>();   // Modern compiler inference (Preferred)
        System.out.println("Both initialization styles compiled cleanly and output identical bytecode.");
    }
}
