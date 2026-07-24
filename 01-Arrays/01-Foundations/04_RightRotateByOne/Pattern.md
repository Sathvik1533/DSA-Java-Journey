# Rotation Pattern (Right)

## Pattern Name
**Rotation Pattern** (Right Rotation)

## Purpose
Cyclically shift array elements to the right.

## Story / Intuition
Like a conveyor belt moving right - the last item falls off the right end and reappears at the left end.

## English Algorithm
1. Store last element temporarily
2. Shift all elements one position right
3. Place the saved element at the first position

## Generic Java Template
```java
int temp = arr[size - 1];
for(int i = size - 1; i > 0; i--) {
    arr[i] = arr[i - 1];
}
arr[0] = temp;
```

## Time Complexity
**O(n)** - Single pass through array

## Space Complexity
**O(1)** - Only one temp variable

## Common Mistakes
1. **Forgetting to save last element** - Last element gets lost
2. **Wrong loop direction** - Should iterate backwards
3. **Off-by-one in loop** - Should be `i > 0`

## Interview Usage
- Rotate array operations
- Circular buffer implementations
- Right shift operations
- Cyclic patterns

## Related Problems
1. Rotate array right by K
2. Reverse array in groups
3. Spiral matrix traversal
4. Rotate matrix 90 degrees
5. Next permutation
