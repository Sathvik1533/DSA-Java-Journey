# Check if Array is Sorted

## Problem Statement
Determine if an array is sorted in ascending order.

## Input
`[10, 20, 30, 40, 50]`

## Output
`Sorted`

## Dry Run
```
Array: [10, 20, 30, 40, 50]

i=0: arr[0]=10 <= arr[1]=20 ✓
i=1: arr[1]=20 <= arr[2]=30 ✓
i=2: arr[2]=30 <= arr[3]=40 ✓
i=3: arr[3]=40 <= arr[4]=50 ✓

Result: Sorted
```

## Explanation
Compare each element with its next neighbor:
- If any element is greater than the next, array is not sorted
- If all comparisons pass, array is sorted

## Pattern Used
**Adjacent Comparison Pattern**

## Complexity
- **Time Complexity**: O(n) - single pass
- **Space Complexity**: O(1) - only boolean flag

## Key Learning
- Only need to check adjacent pairs
- Can break early if unsorted pair found
- Loop runs till `length - 1` to avoid out of bounds
