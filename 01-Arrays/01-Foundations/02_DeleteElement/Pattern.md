# Movement Pattern (Left Shift)

## Pattern Name
**Movement Pattern** (Left Shift)

## Purpose
Remove an element from an array by shifting elements to fill the gap.

## Story / Intuition
Imagine a row of people. If person at position 3 leaves, everyone after position 3 moves one step forward to close the gap.

## English Algorithm
1. Start from the deletion index
2. Move each element one position to the left
3. Continue until second-last element
4. Decrement the logical size

## Generic Java Template
```java
for(int i = index; i < size - 1; i++) {
    arr[i] = arr[i + 1];
}
size--;
```

## Time Complexity
**O(n)** - In worst case (deleting at index 0), we shift all n-1 elements

## Space Complexity
**O(1)** - No extra space used

## Common Mistakes
1. **Wrong loop bound** - Should be `i < size - 1`, not `i < size`
2. **Not updating size** - Array appears unchanged
3. **Shifting in wrong direction** - Moving right instead of left
4. **Trying to delete from empty array** - Check size first

## Interview Usage
- Delete operation in arrays
- Remove duplicates
- Filter elements
- Dynamic array implementations

## Related Problems
1. Remove element by value
2. Remove all occurrences of a value
3. Remove duplicates from sorted array
4. Delete node in linked list
5. Remove duplicates from unsorted array
