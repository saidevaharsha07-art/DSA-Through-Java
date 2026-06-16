# 🎯 Find All Duplicates in an Array - LeetCode 442

## Problem Statement

Given an integer array nums of length n where all integers are in the range [1, n], return all the integers that appear twice.

---

## Example

### Input

```text
[4,3,2,7,8,2,3,1]
```

### Output

```text
[2,3]
```

---

## Approach 1: HashSet

Use a HashSet to track visited elements.

If an element already exists in the set, add it to the answer list.

---

## Algorithm

1. Create HashSet.
2. Create ArrayList for duplicates.
3. Traverse array.
4. If element exists in set:
   - Add to answer.
5. Otherwise add to set.
6. Return answer.

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

HashSet helps:

- Duplicate Detection
- Unique Elements
- Fast Lookup

---

## Revision Formula

```java
if(set.contains(num))
```