# Array Foundations

This directory contains 8 fundamental array operations that form the building blocks for more complex algorithms.

## Structure
Each problem folder contains:
- **Java Implementation** - Clean, well-commented code
- **README.md** - Problem explanation with dry run
- **Pattern.md** - Reusable pattern documentation

## Foundation Problems

### 1. Insert Element
**Pattern**: Movement Pattern (Right Shift)  
**Concept**: Shift elements right to create space for insertion  
**Complexity**: O(n) time, O(1) space

### 2. Delete Element
**Pattern**: Movement Pattern (Left Shift)  
**Concept**: Shift elements left to fill gap after deletion  
**Complexity**: O(n) time, O(1) space

### 3. Left Rotate by One
**Pattern**: Rotation Pattern  
**Concept**: Move first element to last, shift others left  
**Complexity**: O(n) time, O(1) space

### 4. Right Rotate by One
**Pattern**: Rotation Pattern  
**Concept**: Move last element to first, shift others right  
**Complexity**: O(n) time, O(1) space

### 5. Check Sorted
**Pattern**: Adjacent Comparison  
**Concept**: Compare each element with next to verify order  
**Complexity**: O(n) time, O(1) space

### 6. Frequency of Element
**Pattern**: Traversal + Counting  
**Concept**: Count occurrences of target element  
**Complexity**: O(n) time, O(1) space

### 7. Find Duplicates (Brute Force)
**Pattern**: Unique Pair Comparison  
**Concept**: Compare every element with every other  
**Complexity**: O(n²) time, O(1) space

### 8. Move Negatives to Beginning
**Pattern**: Swap + Partition  
**Concept**: Partition array by negative/positive condition  
**Complexity**: O(n) time, O(1) space

## Pattern Summary

| Pattern | Problems | Key Idea |
|---------|----------|----------|
| Movement Pattern | #1, #2 | Shift elements to create/fill space |
| Rotation Pattern | #3, #4 | Cyclic shifting with temp storage |
| Adjacent Comparison | #5 | Compare neighbors for validation |
| Traversal + Counting | #6 | Linear scan with counter |
| Unique Pair Comparison | #7 | Nested loops for all pairs |
| Swap + Partition | #8 | Two-pointer partitioning |

## Learning Path
1. Start with Movement patterns (#1, #2) - foundation for array manipulation
2. Learn Rotation (#3, #4) - builds on movement
3. Master Comparison (#5) - introduces validation logic
4. Practice Counting (#6) - basic traversal with accumulation
5. Understand Nested loops (#7) - basis for many O(n²) algorithms
6. Study Partitioning (#8) - foundation for sorting algorithms

## Interview Relevance
- **Insert/Delete**: Dynamic array implementations, ArrayList internals
- **Rotate**: Array rotation problems, string rotation
- **Check Sorted**: Validation in sorting algorithms
- **Frequency**: Hashing problems, majority element
- **Duplicates**: Two-pointer optimization, hashing
- **Partition**: QuickSort, Dutch National Flag, move zeros

## Next Steps
After mastering these foundations:
1. Move to Traversal patterns (Phase A, B, C)
2. Study Accumulation patterns
3. Learn Comparison patterns
4. Practice Searching algorithms
5. Master Frequency counting
6. Understand Transformations
7. Tackle Advanced problems
