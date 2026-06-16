# 🎯 Intersection of Two Arrays - LeetCode 349

## Problem Statement

Given two integer arrays `nums1` and `nums2`, return an array of their intersection.

Each element in the result must be unique.

The result can be returned in any order.

---

## Example 1

```text
Input:
nums1 = [1,2,2,1]
nums2 = [2,2]

Output:
[2]
```

---

## Example 2

```text
Input:
nums1 = [4,9,5]
nums2 = [9,4,9,8,4]

Output:
[9,4]
```

---

## Approach

Use HashSet.

1. Store all elements of nums1 in a HashSet.
2. Traverse nums2.
3. If element exists in set, add it to result set.
4. Convert result set to array.

---

## Algorithm

1. Create set1 and resultSet.
2. Insert nums1 elements into set1.
3. Traverse nums2.
4. If set1 contains nums2[i]:
   - Add to resultSet.
5. Convert resultSet to array.
6. Return array.

---

## Time Complexity

```text
O(N + M)
```

## Space Complexity

```text
O(N)
```

---

## Key Learning

HashSet is useful for:

- Finding Common Elements
- Removing Duplicates
- Set Operations
- Fast Searching

---

## Revision Formula

```java
if(set.contains(num)){
    result.add(num);
}
```