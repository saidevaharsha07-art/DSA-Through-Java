# 🎯 Highest Frequency Element

## Problem Statement

Given an array of integers, find the element that occurs the maximum number of times.

---

## Example

### Input

```text
1 2 1 3 2 1
```

### Output

```text
Highest Frequency Element = 1
Frequency = 3
```

---

## Approach

Use Hashing to store frequencies.

### Steps

1. Create a hash array.
2. Store frequency of every element.
3. Traverse hash array.
4. Find the element having maximum frequency.

---

## Algorithm

```text
1. Count frequencies using hashing.
2. Initialize maxFreq = 0.
3. Traverse hash array.
4. If hash[i] > maxFreq:
      maxFreq = hash[i]
      element = i
5. Print element and frequency.
```

---

## Time Complexity

```text
O(N)
```

---

## Space Complexity

```text
O(N)
```

---

## Key Learnings

- Frequency Counting
- Hashing
- Finding Maximum Frequency
- Query Processing
- Optimized Searching

---

## Real Applications

- Vote Counting
- Most Purchased Product
- Most Frequent Character
- Data Analysis
- Recommendation Systems

---

## Revision Formula

### Frequency Count

```java
hash[arr[i]]++;
```

### Maximum Frequency

```java
if(hash[i] > maxFreq){
    maxFreq = hash[i];
    element = i;
}
```

---

## Quick Revision

```text
Count Frequency → Hashing

Find Maximum Frequency → Traverse Hash Array

Time Complexity → O(N)
```

🚀 Hashing helps us find the most frequent element efficiently.