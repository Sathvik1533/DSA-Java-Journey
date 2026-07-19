# Prefix Sum

## Concept

Precompute cumulative information so range queries become fast.

## Pattern

Build a prefix structure once; derive each valid range from stored cumulative values.

## Recognition Keywords

Range sum, subarray sum, cumulative, query, contiguous.

## Story

Keep a total at every checkpoint so any route segment can be measured quickly.

## Common Mistakes

- Off-by-one errors in prefix indexing
- Incorrect empty-prefix handling
- Recomputing ranges instead of using the prefix structure

## Time Complexity

Typical construction: `O(n)`; range query: `O(1)`.

## Space Complexity

Typical prefix array: `O(n)`.

## Future Connections

Subarray sums, hashing, 2D prefix sums, sliding window alternatives.

## Revision Notes

Status: not started.
