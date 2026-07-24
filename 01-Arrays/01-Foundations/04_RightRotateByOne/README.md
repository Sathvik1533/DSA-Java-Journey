# Right Rotate Array by One

## Problem Statement
Rotate all elements of the array to the right by one position.

## Input
`[10, 20, 30, 40, 50]`

## Output
`[50, 10, 20, 30, 40]`

## Dry Run
```
Initial:  [10, 20, 30, 40, 50]

Step 1: temp = 50

Step 2: Shift right
        [10, 10, 20, 30, 40]

Step 3: arr[0] = temp
        [50, 10, 20, 30, 40]
```

## Explanation
1. Save the last element in a temporary variable
2. Shift all elements one position to the right
3. Place the saved element at the first position

## Pattern Used
**Rotation Pattern**

## Complexity
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

## Key Learning
- Shift from end to beginning
- Last element goes to first position
- Mirror operation of left rotation
