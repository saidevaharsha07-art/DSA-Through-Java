# 🎯 Contains Duplicate - LeetCode 217

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

---

## Example 1

```text
Input: [1,2,3,1]
Output: true
```

## Example 2

```text
Input: [1,2,3,4]
Output: false
```

---

## Approach

Use a HashSet.

If an element already exists in the set, a duplicate is found.

Otherwise add it to the set.

---

## Algorithm

1. Create a HashSet.
2. Traverse the array.
3. If element exists in set → return true.
4. Otherwise add element to set.
5. If traversal completes → return false.

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

HashSet provides O(1) average lookup and insertion.

Useful for:
- Duplicate Detection
- Unique Elements
- Fast Searching

---

## Related Problems

- LC 219: Contains Duplicate II
- LC 220: Contains Duplicate III
- LC 349: Intersection of Two Arrays