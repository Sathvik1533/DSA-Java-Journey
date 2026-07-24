# Delete Element at Given Index

## Problem Statement
Delete an element at a specific index in an array and shift remaining elements to the left.

## Input
- Array: `[10, 20, 30, 40, 50]`
- Index to delete: `2`

## Output
`[10, 20, 40, 50]`

## Dry Run
```
Initial:  [10, 20, 30, 40, 50]  size=5, index=2

Step 1: i=2, arr[2] = arr[3]
        [10, 20, 40, 40, 50]

Step 2: i=3, arr[3] = arr[4]
        [10, 20, 40, 50, 50]

Step 3: i=4, loop ends (i < size-1)

Step 4: size-- → size=4

Result: [10, 20, 40, 50]
```

## Explanation
To delete an element at index `i`:
1. Start from the deletion index
2. Shift each element one position to the left
3. Stop at second-last position
4. Decrement the size

## Pattern Used
**Movement Pattern** - Shifting elements to fill gap

## Complexity
- **Time Complexity**: O(n) - worst case when deleting at index 0
- **Space Complexity**: O(1) - in-place modification

## Key Learning
- Shift from the deletion point forward, not backward
- Loop until `size - 1` to avoid out of bounds
- Update size after deletion
- The last element remains but is ignored due to decreased size
