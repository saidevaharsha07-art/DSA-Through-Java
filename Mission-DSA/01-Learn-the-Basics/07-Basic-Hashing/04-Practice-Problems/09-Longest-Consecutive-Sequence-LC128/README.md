# 🎯 Longest Consecutive Sequence - LeetCode 128

## Problem Statement

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(N) time.

---

## Example 1

Input:

```text
nums = [100,4,200,1,3,2]
```

Output:

```text
4
```

Explanation:

```text
1,2,3,4
```

Length = 4

---

## Example 2

Input:

```text
nums = [0,3,7,2,5,8,4,6,0,1]
```

Output:

```text
9
```

---

## Approach

Use HashSet.

Store all elements in a set.

Only start counting when the current number is the beginning of a sequence.

Meaning:

```java
!set.contains(num - 1)
```

Then continue checking:

```java
num + 1
num + 2
num + 3
...
```

---

## Algorithm

1. Insert all elements into HashSet.
2. Traverse set.
3. If previous element doesn't exist:
   - Start sequence.
4. Count consecutive elements.
5. Update maximum length.
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

HashSet enables O(1) lookup.

This avoids sorting and achieves O(N).

---

## Revision Formula

```java
if(!set.contains(num - 1))
```

This identifies the start of a sequence.