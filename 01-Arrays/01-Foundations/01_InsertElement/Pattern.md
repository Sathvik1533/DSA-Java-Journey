# Movement Pattern

## Pattern Name
**Movement Pattern** (Right Shift)

## Purpose
Create space in an array by shifting elements to make room for a new element.

## Story / Intuition
Imagine a row of people standing in a queue. A new person wants to join at position 3. Everyone from position 3 onwards needs to move one step backward to make space.

## English Algorithm
1. Start from the last occupied position
2. Move each element one position to the right
3. Continue until you reach the insertion index
4. Place the new element at the insertion index
5. Increment the logical size

## Generic Java Template
```java
for(int i = size; i > index; i--) {
    arr[i] = arr[i - 1];
}
arr[index] = element;
size++;
```

## Time Complexity
**O(n)** - In worst case (inserting at index 0), we shift all n elements

## Space Complexity
**O(1)** - No extra space used, modification is in-place

## Common Mistakes
1. **Shifting from start instead of end** - This overwrites data
2. **Not checking array capacity** - Can cause ArrayIndexOutOfBoundsException
3. **Forgetting to update size** - Logical size won't reflect the change
4. **Off-by-one errors** - Loop condition should be `i > index`, not `i >= index`

## Interview Usage
This pattern appears in:
- Insert operation in arrays
- Creating gaps for insertion sort
- Dynamic array implementations
- String manipulation problems

## Related Problems
1. Insert element in sorted array
2. Insertion Sort implementation
3. Merge two sorted arrays
4. Remove duplicates from sorted array
5. Rotate array by K positions
