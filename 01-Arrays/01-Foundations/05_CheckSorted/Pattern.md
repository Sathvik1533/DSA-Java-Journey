# Adjacent Comparison Pattern

## Pattern Name
**Adjacent Comparison Pattern**

## Purpose
Validate properties by comparing neighboring elements.

## Story / Intuition
Like checking if stairs go up smoothly - each step should be higher than or equal to the previous one.

## English Algorithm
1. Set flag to true
2. Compare each element with its next neighbor
3. If any pair violates the condition, set flag false and break
4. Return the flag

## Generic Java Template
```java
boolean sorted = true;
for(int i = 0; i < arr.length - 1; i++) {
    if(arr[i] > arr[i + 1]) {
        sorted = false;
        break;
    }
}
```

## Time Complexity
**O(n)** - Best case O(1) if first pair fails, worst case O(n)

## Space Complexity
**O(1)** - Only boolean flag

## Common Mistakes
1. **Wrong loop bound** - Should be `i < length - 1`, not `i < length`
2. **Not breaking early** - Wastes iterations after finding violation
3. **Comparing non-adjacent elements** - Inefficient
4. **Wrong comparison operator** - `>` for ascending, `<` for descending

## Interview Usage
- Check sorted array
- Detect peaks and valleys
- Find local extrema
- Validate monotonic sequences

## Related Problems
1. Check if array is sorted and rotated
2. Find peak element
3. Check if array is monotonic
4. Longest increasing subsequence
5. Check if linked list is palindrome
