# Swap + Partition Pattern

## Pattern Name
**Swap + Partition Pattern**

## Purpose
Rearrange array elements based on a condition, grouping similar elements together.

## Story / Intuition
Like organizing books on a shelf - keep all technical books on the left and all fiction on the right, swapping positions as you scan through.

## English Algorithm
1. Initialize left pointer at start
2. Traverse array with another pointer
3. When element matches condition, swap with left pointer position
4. Increment left pointer after swap
5. Continue until end

## Generic Java Template
```java
int left = 0;
for(int i = 0; i < arr.length; i++) {
    if(condition) {
        // Swap arr[left] and arr[i]
        int temp = arr[left];
        arr[left] = arr[i];
        arr[i] = temp;
        left++;
    }
}
```

## Time Complexity
**O(n)** - Single pass through array

## Space Complexity
**O(1)** - In-place, only pointer variables

## Common Mistakes
1. **Not incrementing left** - Overwrites previous swapped elements
2. **Swapping when not needed** - Wastes operations
3. **Not using temp variable** - Loses data during swap
4. **Forgetting to update left after swap** - Wrong partition

## Interview Usage
- Partition problems
- QuickSort partition logic
- Dutch National Flag
- Move zeros to end
- Segregate even/odd

## Related Problems
1. Move zeros to end
2. Sort 0s, 1s, and 2s (Dutch National Flag)
3. Partition array by pivot
4. Separate even and odd
5. QuickSort partition
