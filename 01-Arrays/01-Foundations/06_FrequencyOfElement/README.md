# Frequency of Element

## Problem Statement
Count how many times a specific element appears in an array.

## Input
- Array: `[10, 20, 10, 30, 10, 40]`
- Target: `10`

## Output
`Frequency of 10 is: 3`

## Dry Run
```
Array: [10, 20, 10, 30, 10, 40]
Target: 10
count = 0

i=0: arr[0]=10 → count=1
i=1: arr[1]=20 → count=1
i=2: arr[2]=10 → count=2
i=3: arr[3]=30 → count=2
i=4: arr[4]=10 → count=3
i=5: arr[5]=40 → count=3

Result: 3
```

## Explanation
1. Initialize a counter to 0
2. Traverse the entire array
3. Whenever target element is found, increment counter
4. Return the counter

## Pattern Used
**Traversal + Counting Pattern**

## Complexity
- **Time Complexity**: O(n) - must check every element
- **Space Complexity**: O(1) - only counter variable

## Key Learning
- Simple linear scan is sufficient
- Cannot optimize below O(n) for unsorted array
- For sorted array, binary search can find first and last occurrence
