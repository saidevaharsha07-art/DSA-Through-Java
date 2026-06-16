# 🎯 Subarray Sum Equals K - LeetCode 560

## Problem Statement

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals k.

---

## Example 1

Input:

```text
nums = [1,1,1]
k = 2
```

Output:

```text
2
```

Explanation:

```text
[1,1]
[1,1]
```

---

## Example 2

Input:

```text
nums = [1,2,3]
k = 3
```

Output:

```text
2
```

Explanation:

```text
[1,2]
[3]
```

---

## Approach

Use:

- Prefix Sum
- HashMap

Store:

```java
prefixSum -> frequency
```

If:

```java
prefixSum - k
```

exists in HashMap, then a valid subarray exists.

---

## Algorithm

1. Initialize HashMap.
2. Put:

```java
0 -> 1
```

3. Traverse array.
4. Calculate running prefix sum.
5. Check if:

```java
prefixSum - k
```

exists.
6. Add its frequency to answer.
7. Store current prefix sum.
8. Return answer.

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

Prefix Sum + HashMap is used in:

- Subarray Sum Problems
- Equal Sum Problems
- Continuous Array Problems
- Prefix-Based Questions

---

## Revision Formula

```java
count += map.getOrDefault(prefixSum - k, 0);
```

```java
map.put(prefixSum,
map.getOrDefault(prefixSum, 0) + 1);
```