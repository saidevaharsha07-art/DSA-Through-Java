# 724. Find Pivot Index

## Difficulty
Easy

## Problem Statement

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

Return the leftmost pivot index. If no such index exists, return -1.

---

## Example 1

Input:

nums = [1,7,3,6,5,6]

Output:

3

Explanation:

Left Sum = 1 + 7 + 3 = 11

Right Sum = 5 + 6 = 11

---

## Example 2

Input:

nums = [1,2,3]

Output:

-1

---

## Approach

1. Calculate total sum of the array.
2. Maintain a running left sum.
3. Compute right sum using:

rightSum = totalSum - leftSum - nums[i]

4. If leftSum equals rightSum, return current index.
5. Otherwise continue traversal.
6. Return -1 if no pivot index exists.

---

## Pseudocode

totalSum = sum of array

leftSum = 0

for each index i

    rightSum = totalSum - leftSum - nums[i]

    if leftSum == rightSum
        return i

    leftSum += nums[i]

return -1

---

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

---

## Topics

- Arrays
- Prefix Sum

---

## LeetCode Link

https://leetcode.com/problems/find-pivot-index/