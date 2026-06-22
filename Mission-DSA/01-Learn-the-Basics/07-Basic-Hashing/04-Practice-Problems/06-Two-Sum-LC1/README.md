# 🎯 Two Sum - LeetCode 1

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that each input has exactly one solution.

---

## Example 1

```text
Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]
```

Explanation:

nums[0] + nums[1] = 2 + 7 = 9

---

## Example 2

```text
Input:
nums = [3,2,4]
target = 6

Output:
[1,2]
```

---

## Approach

Use HashMap.

Store:

```java
number → index
```

For every element:

Find:

```java
target - currentElement
```

If it exists in HashMap, return both indices.

Otherwise store current element.

---

## Algorithm

1. Create HashMap.
2. Traverse array.
3. Calculate complement = target - nums[i].
4. If complement exists:
   - Return indices.
5. Otherwise store current number and index.
6. Continue.

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

HashMap helps reduce:

```text
O(N²)
```

to

```text
O(N)
```

This is one of the most important HashMap interview problems.

---

## Revision Formula

```java
int complement = target - nums[i];
```

```java
if(map.containsKey(complement))
```