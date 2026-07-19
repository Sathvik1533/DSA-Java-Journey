# Arrays — Accumulation

## Concept

Building a result incrementally while traversing values.

## Pattern

Initialize an accumulator, update it for each relevant value, then return or record it.

## Recognition Keywords

Sum, total, count, product, aggregate, running value.

## Story

Keep a running notebook total as each receipt is processed.

## Common Mistakes

- Wrong initial value
- Overflow risk
- Updating in the wrong order

## Time Complexity

Typical full pass: `O(n)`.

## Space Complexity

Typical running accumulator: `O(1)`.

## Future Connections

Running sum, prefix sum, sliding window.

## Revision Notes

Status: not started.
