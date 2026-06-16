# 🎯 Count Frequencies

## Problem Statement

Given an array of integers, count the frequency of each element.

---

## Example

### Input

```text
1 2 1 3 2 1
```

### Output

```text
1 -> 3
2 -> 2
3 -> 1
```

---

## Approach 1: Brute Force

For every element, traverse the entire array and count occurrences.

### Time Complexity

```text
O(N²)
```

### Space Complexity

```text
O(1)
```

---

## Approach 2: Hashing

Use a hash array to store frequencies.

### Steps

1. Create a hash array.
2. Traverse the given array.
3. Increase frequency using:

```java
hash[arr[i]]++;
```

4. Print frequencies.

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

## Key Learnings

- Frequency Counting
- Number Hashing
- Query Based Problems
- Time Complexity Optimization
- Hash Array Usage

---

## Real Applications

- Counting Votes
- Finding Duplicates
- Majority Element
- Frequency Analysis
- Data Processing

---

## Revision Formula

```java
hash[arr[i]]++;
```

🚀 Hashing converts O(N²) frequency counting into O(N).