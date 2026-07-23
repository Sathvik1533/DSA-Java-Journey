# Insert Element at Given Index

## Problem Statement
Insert an element at a specific index in an array and shift existing elements to the right.

## Input
- Array: `[10, 20, 30, 40]`
- Element to insert: `25`
- Index: `2`

## Output
`[10, 20, 25, 30, 40]`

## Dry Run
```
Initial:  [10, 20, 30, 40, _, _]  size=4, index=2, element=25

Step 1: i=4, shift arr[3] to arr[4]
        [10, 20, 30, 40, 40, _]

Step 2: i=3, shift arr[2] to arr[3]
        [10, 20, 30, 30, 40, _]

Step 3: i=2, loop ends (i > index)

Step 4: Insert element at index 2
        [10, 20, 25, 30, 40, _]

Step 5: size++ → size=5
```

## Explanation
To insert an element at index `i`:
1. Start from the last element
2. Shift each element one position to the right
3. Stop when you reach the insertion index
4. Place the new element at that index
5. Increment the size

## Pattern Used
**Movement Pattern** - Shifting elements to create space

## Complexity
- **Time Complexity**: O(n) - worst case when inserting at index 0
- **Space Complexity**: O(1) - in-place modification

## Key Learning
- Always shift from the end to avoid overwriting data
- Make sure array has enough capacity before inserting
- Update the size after insertion
