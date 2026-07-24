# Left Rotate Array by One

## Problem Statement
Rotate all elements of the array to the left by one position.

## Input
`[10, 20, 30, 40, 50]`

## Output
`[20, 30, 40, 50, 10]`

## Dry Run
```
Initial:  [10, 20, 30, 40, 50]

Step 1: temp = 10

Step 2: Shift left
        [20, 30, 40, 50, 50]

Step 3: arr[4] = temp
        [20, 30, 40, 50, 10]
```

## Explanation
1. Save the first element in a temporary variable
2. Shift all elements one position to the left
3. Place the saved element at the last position

## Pattern Used
**Rotation Pattern**

## Complexity
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

## Key Learning
- Only one temporary variable needed
- First element goes to last position
- All other elements shift left by one
