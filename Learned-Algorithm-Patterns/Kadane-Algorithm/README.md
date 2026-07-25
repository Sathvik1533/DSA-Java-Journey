# Kadane's Algorithm

## Overview

Kadane's Algorithm is a dynamic programming technique used to find the maximum (or minimum) sum of a contiguous subarray within a one-dimensional array. It's one of the most elegant and efficient algorithms in computer science, solving the Maximum Subarray Problem in linear time.

---

## Problem Statement

### Maximum Subarray Problem
Given an array of integers (both positive and negative), find the contiguous subarray with the largest sum.

**Example:**
```
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: Subarray [4, -1, 2, 1] has the largest sum = 6
```

### Minimum Subarray Problem
Given an array of integers, find the contiguous subarray with the smallest sum.

**Example:**
```
Input: [2, -5, 3, -4, 6, -2]
Output: -5
Explanation: Subarray [-5] has the smallest sum = -5
```

---

## The Core Intuition

### Maximum Kadane

**Goal:** Find the largest contiguous subarray sum.

**English:**
> Continue the previous subarray OR Start a new subarray  
> Choose whichever gives the **larger** sum.

### Minimum Kadane

**Goal:** Find the smallest contiguous subarray sum.

**English:**
> Continue the previous subarray OR Start a new subarray  
> Choose whichever gives the **smaller** sum.

---

**At each position, you have two choices:**
1. **Continue** the existing subarray by adding the current element
2. **Start fresh** from the current element

The algorithm continuously makes the optimal choice by comparing:
- `currentSum + arr[i]` (continue existing subarray)
- `arr[i]` (start new subarray from current element)

---

## Algorithm Explanation

### Maximum Sum Variant

```
Initialize:
- maxSum = Integer.MIN_VALUE (global maximum)
- currentSum = 0 (current subarray sum)

For each element in array:
    currentSum = max(arr[i], currentSum + arr[i])
    maxSum = max(maxSum, currentSum)
```

**Why it works:**
- `currentSum` tracks the best sum ending at the current position
- If `currentSum + arr[i]` becomes negative or less than `arr[i]`, we reset and start fresh
- `maxSum` keeps track of the best sum seen so far across all positions

### Minimum Sum Variant

```
Initialize:
- minSum = Integer.MAX_VALUE (global minimum)
- currentSum = 0 (current subarray sum)

For each element in array:
    currentSum = min(arr[i], currentSum + arr[i])
    minSum = min(minSum, currentSum)
```

**Why it works:**
- Same logic as maximum, but we're looking for the smallest possible sum
- `currentSum` tracks the worst (minimum) sum ending at the current position
- If `currentSum + arr[i]` becomes greater than `arr[i]`, we reset

---

## Visual Walkthrough

### Maximum Subarray Example

**Array:** `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`

| Index | Element | currentSum Calculation | currentSum | maxSum |
|-------|---------|------------------------|------------|--------|
| 0 | -2 | max(-2, 0 + -2) = -2 | -2 | -2 |
| 1 | 1 | max(1, -2 + 1) = 1 | 1 | 1 |
| 2 | -3 | max(-3, 1 + -3) = -2 | -2 | 1 |
| 3 | 4 | max(4, -2 + 4) = 4 | 4 | 4 |
| 4 | -1 | max(-1, 4 + -1) = 3 | 3 | 4 |
| 5 | 2 | max(2, 3 + 2) = 5 | 5 | 5 |
| 6 | 1 | max(1, 5 + 1) = 6 | 6 | 6 |
| 7 | -5 | max(-5, 6 + -5) = 1 | 1 | 6 |
| 8 | 4 | max(4, 1 + 4) = 5 | 5 | 6 |

**Result:** Maximum subarray sum = **6** (subarray: [4, -1, 2, 1])

---

## Time and Space Complexity

| Metric | Complexity | Explanation |
|--------|------------|-------------|
| **Time** | O(n) | Single pass through the array |
| **Space** | O(1) | Only two variables used (currentSum, maxSum/minSum) |

---

## When to Use Kadane's Algorithm

### Problem Patterns
- Finding maximum/minimum subarray sum
- Finding best consecutive sequence
- Optimizing contiguous selections
- Stock profit problems (buy/sell once)
- Maximum product subarray (variant)

### Interview Red Flags
Look for these keywords in problem statements:
- "contiguous subarray"
- "consecutive elements"
- "maximum sum"
- "best sequence"
- "no breaks allowed"

---

## Common Variations

### 1. Return the Subarray Indices
Track `start` and `end` indices while updating `maxSum`

### 2. Handle All Negative Numbers
The algorithm naturally handles this - returns the least negative number

### 3. Circular Array Maximum Subarray
Find max of:
- Normal Kadane's result
- Total sum - Minimum subarray sum (wrapping around)

### 4. Maximum Product Subarray
Track both `maxProduct` and `minProduct` (negative × negative = positive)

---

## Interview Tips

1. **Always clarify:** Can the array contain all negative numbers?
2. **Edge cases to test:**
   - Single element array
   - All negative numbers
   - All positive numbers
   - Mix of positive and negative
3. **Follow-up questions:** Be ready to return actual subarray, not just the sum
4. **Optimization:** This IS the optimal solution - no further optimization needed

---

## Related LeetCode Problems

- **53. Maximum Subarray** (Easy) - Direct application
- **918. Maximum Sum Circular Subarray** (Medium) - Circular variant
- **152. Maximum Product Subarray** (Medium) - Product variant
- **1186. Maximum Subarray Sum with One Deletion** (Medium) - With deletion
- **1749. Maximum Absolute Sum of Any Subarray** (Medium) - Use both max and min Kadane

---

## Practice Strategy

1. **Master the basic maximum sum version first**
2. **Implement the minimum sum variant**
3. **Solve variations that require tracking indices**
4. **Tackle circular array problems**
5. **Practice product subarray variants**

---

## Files in This Folder

| File | Description |
|------|-------------|
| `KadaneAlgorithm.java` | Maximum subarray sum implementation |
| `KadaneAlgorithmMin.java` | Minimum subarray sum implementation |

---

## Key Takeaways

✅ Kadane's Algorithm is O(n) - most efficient solution for max/min subarray  
✅ Works by maintaining "best sum ending at current position"  
✅ Handles all negative arrays naturally  
✅ Foundation for many DP problems  
✅ Must-know algorithm for technical interviews
