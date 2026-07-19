# Formula Book

Quick-reference formulas and identities. Add only after they are learned.

## Traversal

- Array indices: `0` through `n - 1`

## Running Sum

- `runningSum = runningSum + currentValue`

## Prefix Sum

- `prefix[i] = prefix[i - 1] + array[i]`
- Range sum: `prefix[right] - prefix[left - 1]` (when applicable)

## Sliding Window

- Window length: `right - left + 1`

## Binary Search

- Safe midpoint: `left + (right - left) / 2`

## Hashing

- Frequency update: `frequency[value] = frequency.getOrDefault(value, 0) + 1`

## Trees

- Record formulas after learning the relevant traversal or property.
