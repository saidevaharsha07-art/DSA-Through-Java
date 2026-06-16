# 🎯 Top K Frequent Elements - LeetCode 347

## Problem Statement

Given an integer array nums and an integer k, return the k most frequent elements.

You may return the answer in any order.

---

## Example 1

Input:

```text
nums = [1,1,1,2,2,3]
k = 2
```

Output:

```text
[1,2]
```

---

## Example 2

Input:

```text
nums = [1]
k = 1
```

Output:

```text
[1]
```

---

## Approach

Use:

- HashMap → Frequency Count
- PriorityQueue (Max Heap) → Get highest frequencies

---

## Algorithm

1. Count frequency using HashMap.
2. Create Max Heap based on frequency.
3. Add all keys to heap.
4. Remove top k elements.
5. Store in answer array.
6. Return result.

---

## Time Complexity

```text
O(N log N)
```

## Space Complexity

```text
O(N)
```

---

## Key Learning

HashMap helps count frequencies.

PriorityQueue helps retrieve highest frequency elements efficiently.

---

## Revision Formula

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

```java
PriorityQueue<Integer> pq =
new PriorityQueue<>(
(a,b) -> map.get(b) - map.get(a)
);
```