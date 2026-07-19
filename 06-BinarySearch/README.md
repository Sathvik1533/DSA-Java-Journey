# Binary Search

## Concept

Repeatedly reduce an ordered or monotonic search space by half.

## Pattern

Define the search predicate, maintain bounds, and choose a safe midpoint.

## Recognition Keywords

Sorted, first/last occurrence, minimum feasible, maximum feasible, monotonic.

## Story

Open a sorted book near the middle, then discard the impossible half.

## Common Mistakes

- Applying without an ordered/monotonic condition
- Incorrect loop bounds
- Overflow-prone midpoint calculation

## Time Complexity

`O(log n)` over the search space.

## Space Complexity

Iterative form: `O(1)`.

## Future Connections

Search on answer, trees, rotated arrays.

## Revision Notes

Status: not started.
