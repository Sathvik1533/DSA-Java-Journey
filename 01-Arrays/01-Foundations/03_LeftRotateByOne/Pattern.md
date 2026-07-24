# Rotation Pattern

## Pattern Name
**Rotation Pattern** (Left Rotation)

## Purpose
Cyclically shift array elements to the left.

## Story / Intuition
Like a conveyor belt moving left - the first item falls off the left end and reappears at the right end.

## English Algorithm
1. Store first element temporarily
2. Shift all elements one position left
3. Place the saved element at the last position

## Generic Java Template
```java
int temp = arr[0];
for(int i = 0; i < size - 1; i++) {
    arr[i] = arr[i + 1];
}
arr[size - 1] = temp;
```

## Time Complexity
**O(n)** - Single pass through array

## Space Complexity
**O(1)** - Only one temp variable

## Common Mistakes
1. **Forgetting to save first element** - First element gets lost
2. **Wrong loop bound** - Should be `i < size - 1`
3. **Not handling empty array** - Check size first

## Interview Usage
- Rotate array by K positions
- String rotation problems
- Circular arrays
- Queue implementation

## Related Problems
1. Rotate array by K positions
2. Check if string is rotation of another
3. Circular tour problem
4. Rotate linked list
5. Maximum circular subarray sum
