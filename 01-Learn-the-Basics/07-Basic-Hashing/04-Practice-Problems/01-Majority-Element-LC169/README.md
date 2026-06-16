# 🎯 Contains Duplicate (LeetCode 217)

## Problem Statement

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

---

## Example 1

Input:

```text
[1,2,3,1]
```

Output:

```text
true
```

---

## Example 2

Input:

```text
[1,2,3,4]
```

Output:

```text
false
```

---

## Approach

Use HashSet.

If an element already exists in the set, return true.

Otherwise add it to the set.

---

## Time Complexity

```text
O(N)
```

## Space Complexity

```text
O(N)
```

---

## Key Learning

HashSet is useful for detecting duplicates efficiently.