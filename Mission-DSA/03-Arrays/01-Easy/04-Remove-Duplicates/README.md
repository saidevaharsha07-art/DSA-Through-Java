# Remove Duplicates from Sorted Array

## Problem Statement

Given a sorted array, remove the duplicates in-place such that each element appears only once and return the number of unique elements.

## Example

Input:
[1,1,2,2,2,3,3]

Output:
[1,2,3]
Length = 3

---

## Optimal Approach (Two Pointers)

### Logic

1. Assume first element is unique.
2. Use pointer i to track the position of unique elements.
3. Traverse array using pointer j.
4. If arr[j] != arr[i], move i forward and place arr[j] at arr[i].
5. At the end, i + 1 gives the count of unique elements.

---

## Time Complexity

O(n)

## Space Complexity

O(1)

---

## Key Learning

- Two Pointer Technique
- In-place Array Modification
- Sorted Array Properties

---

## Example

Input:
[1,1,2,2,3]

Step-by-step:

1 1 2 2 3

i = 0

Found 2:
1 2 _ _ _
i = 1

Found 3:
1 2 3 _ _
i = 2

Unique Count = 3