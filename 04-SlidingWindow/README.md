# Sliding Window

## Concept

Maintain information about a contiguous range while moving through a sequence.

## Pattern

Expand, validate, and shrink a window while preserving the target condition.

## Recognition Keywords

Subarray, substring, contiguous, longest, shortest, at most, window.

## Story

A movable frame scans a row while keeping only the useful portion in view.

## Common Mistakes

- Using it for non-contiguous problems
- Shrinking before the condition is checked
- Failing to remove outgoing values

## Time Complexity

Often `O(n)` when each pointer advances at most `n` times.

## Space Complexity

Depends on window state, often `O(1)` or `O(k)`.

## Future Connections

Frequency maps, two pointers, prefix sum variants.

## Revision Notes

Status: not started.
