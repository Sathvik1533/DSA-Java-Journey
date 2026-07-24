# Find Duplicates (Brute Force)

## Problem Statement
Find and print all duplicate elements in an array.

## Input
`[10, 20, 30, 10, 40, 20]`

## Output
```
Duplicate elements:
10
20
```

## Dry Run
```
Array: [10, 20, 30, 10, 40, 20]

i=0, j=1: 10≠20
i=0, j=2: 10≠30
i=0, j=3: 10==10 → Print 10, break

i=1, j=2: 20≠30
i=1, j=3: 20≠10
i=1, j=4: 20≠40
i=1, j=5: 20==20 → Print 20, break

i=2, j=3: 30≠10
i=2, j=4: 30≠40
i=2, j=5: 30≠20

i=3, j=4: 10≠40
i=3, j=5: 10≠20

i=4, j=5: 40≠20
```

## Explanation
1. Use outer loop to pick each element
2. Use inner loop to compare with remaining elements
3. If match found, it's a duplicate
4. Break to avoid printing same duplicate again

## Pattern Used
**Unique Pair Comparison**

## Complexity
- **Time Complexity**: O(n²) - nested loops
- **Space Complexity**: O(1) - no extra space

## Key Learning
- Brute force approach, not optimal
- Better solutions use HashSet (O(n) time, O(n) space)
- For sorted array, duplicates are adjacent
