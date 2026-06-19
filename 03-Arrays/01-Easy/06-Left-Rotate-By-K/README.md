# Left Rotate Array by K Places

## Problem Statement

Given an array and an integer K, rotate the array to the left by K positions.

## Example

Input:
[1, 2, 3, 4, 5, 6, 7]
K = 2

Output:
[3, 4, 5, 6, 7, 1, 2]

---

## Optimal Approach (Reversal Algorithm)

### Logic

1. Reverse first K elements.
2. Reverse remaining N-K elements.
3. Reverse the entire array.

---

## Time Complexity

O(n)

## Space Complexity

O(1)

---

## Key Learning

- Array Reversal
- Rotation Optimization
- In-place Modification