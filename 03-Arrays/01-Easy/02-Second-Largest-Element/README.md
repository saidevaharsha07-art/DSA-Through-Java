# Second Largest Element in Array

## Problem Statement

Given an array of integers, find the second largest element in the array.

## Example

Input:
[1, 2, 4, 7, 7, 5]

Output:
5

---

## Brute Force Approach

### Logic
1. Sort the array.
2. Traverse from the end.
3. Find the first element smaller than the largest element.

### Time Complexity
O(n log n)

### Space Complexity
O(1)

---

## Optimal Approach

### Logic
1. Maintain two variables:
   - largest
   - secondLargest
2. Traverse the array once.
3. Update largest and secondLargest accordingly.

### Time Complexity
O(n)

### Space Complexity
O(1)

---

## Key Learning

- Single Pass Traversal
- Maintaining Multiple Maximum Values
- Handling Duplicate Elements

## Edge Cases

Input:
[7, 7, 7, 7]

Output:
No Second Largest Element