# Unique Pair Comparison Pattern

## Pattern Name
**Unique Pair Comparison Pattern**

## Purpose
Compare every element with every other element exactly once.

## Story / Intuition
Like checking handshakes at a party - each person shakes hands with everyone else exactly once. No need to shake hands twice with the same person.

## English Algorithm
1. Outer loop picks first element of pair (i = 0 to n-2)
2. Inner loop picks second element of pair (j = i+1 to n-1)
3. Compare arr[i] with arr[j]
4. Perform action if match found

## Generic Java Template
```java
for(int i = 0; i < arr.length - 1; i++) {
    for(int j = i + 1; j < arr.length; j++) {
        if(arr[i] == arr[j]) {
            // Action when match found
        }
    }
}
```

## Time Complexity
**O(n²)** - Generates n(n-1)/2 pairs

## Space Complexity
**O(1)** - No extra space (unless storing results)

## Common Mistakes
1. **Starting j from 0** - Compares same pairs twice
2. **Wrong loop bounds** - Outer should be `i < n-1`, inner `j < n`
3. **Comparing element with itself** - Starting j from i instead of i+1
4. **Not breaking when needed** - May print duplicate matches

## Interview Usage
- Find duplicates
- Find pairs with given sum
- Count inversions
- All pairs problems

## Related Problems
1. Two sum (with indices)
2. Three sum
3. Find pair with difference K
4. Count pairs with sum divisible by K
5. Maximum product of two elements
