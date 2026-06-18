# Check if Array is Sorted

## Problem Statement

Given an array of integers, check whether the array is sorted in non-decreasing order.

## Example

Input:
[1, 2, 3, 4, 5]

Output:
true

Input:
[1, 3, 2, 4, 5]

Output:
false

---

## Optimal Approach

### Logic

1. Traverse the array from index 1.
2. Compare current element with previous element.
3. If current element is smaller than previous element, array is not sorted.
4. Otherwise continue checking.
5. If no violation is found, array is sorted.

---

## Time Complexity

O(n)

## Space Complexity

O(1)

---

## Key Learning

- Array Traversal
- Adjacent Element Comparison
- Early Termination

---

## Edge Cases

Input:
[1]

Output:
true

Input:
[1, 1, 1, 1]

Output:
true