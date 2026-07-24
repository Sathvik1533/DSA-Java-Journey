# Traversal + Counting Pattern

## Pattern Name
**Traversal + Counting Pattern**

## Purpose
Count occurrences of elements that match a condition.

## Story / Intuition
Like counting how many red cars pass by on a highway - you watch every car and increment count when you see a red one.

## English Algorithm
1. Initialize counter to 0
2. Traverse entire array
3. If element matches condition, increment counter
4. Return counter

## Generic Java Template
```java
int count = 0;
for(int i = 0; i < arr.length; i++) {
    if(arr[i] == target) {
        count++;
    }
}
```

## Time Complexity
**O(n)** - Must visit every element

## Space Complexity
**O(1)** - Only counter variable

## Common Mistakes
1. **Stopping early** - Must check entire array
2. **Not initializing counter** - Starts with garbage value
3. **Wrong comparison** - Use `==` for primitives, `.equals()` for objects

## Interview Usage
- Count specific elements
- Count elements satisfying condition
- Frequency of array elements
- Majority element problems

## Related Problems
1. Count even numbers
2. Count elements greater than X
3. Majority element
4. First unique character
5. Most frequent element
