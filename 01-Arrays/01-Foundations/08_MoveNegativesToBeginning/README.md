# Move Negatives to Beginning

## Problem Statement
Rearrange array so all negative numbers appear before positive numbers.

## Input
`[10, -2, 30, -5, 40, -1]`

## Output
`[-2, -5, -1, 10, 30, 40]` (order may vary)

## Dry Run
```
Array: [10, -2, 30, -5, 40, -1]
left = 0

i=0: arr[0]=10 (positive) → skip
i=1: arr[1]=-2 (negative) → swap(arr[0], arr[1])
     [−2, 10, 30, -5, 40, -1], left=1

i=2: arr[2]=30 (positive) → skip
i=3: arr[3]=-5 (negative) → swap(arr[1], arr[3])
     [−2, −5, 30, 10, 40, -1], left=2

i=4: arr[4]=40 (positive) → skip
i=5: arr[5]=-1 (negative) → swap(arr[2], arr[5])
     [−2, −5, −1, 10, 40, 30], left=3

Result: [-2, -5, -1, 10, 40, 30]
```

## Explanation
1. Maintain a `left` pointer for next negative position
2. Traverse array with `i`
3. When negative found, swap with position `left`
4. Increment `left`
5. Result: all negatives on left, positives on right

## Pattern Used
**Swap + Partition Pattern**

## Complexity
- **Time Complexity**: O(n) - single pass
- **Space Complexity**: O(1) - in-place rearrangement

## Key Learning
- Similar to Dutch National Flag problem
- Partition logic used in QuickSort
- Relative order within groups not preserved
