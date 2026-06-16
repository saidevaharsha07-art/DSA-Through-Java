# 🎯 Majority Element - LeetCode 169

## Problem Statement

Given an array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than `n / 2` times.

---

## Example

```text
Input: nums = [3,2,3]
Output: 3
```

```text
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

---

## Approach: Boyer-Moore Voting Algorithm

Maintain a candidate and a count.

If count becomes 0, choose the current element as candidate.

If current element is equal to candidate, increase count.

Otherwise, decrease count.

---

## Time Complexity

```text
O(N)
```

## Space Complexity

```text
O(1)
```

---

## Key Learning

Boyer-Moore Voting Algorithm is used when the majority element appears more than `n / 2` times.