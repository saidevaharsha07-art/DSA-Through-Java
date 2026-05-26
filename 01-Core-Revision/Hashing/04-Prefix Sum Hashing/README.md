#  Prefix Sum + Hashing

## Definition

Prefix Sum + Hashing is a technique used to efficiently solve subarray sum problems.

Instead of checking every possible subarray, we use:

1. Prefix Sum
2. HashMap

to reduce the time complexity from O(n²) to O(n).

---

# Why Prefix Sum + Hashing?

Brute Force:

```java
for(int i = 0; i < n; i++) {
    int sum = 0;

    for(int j = i; j < n; j++) {
        sum += arr[j];
    }
}
```

Time Complexity:

```text
O(n²)
```

Using Prefix Sum + Hashing:

```text
O(n)
```

---

# Prefix Sum Revision

Array:

```text
1 2 3 4
```

Prefix Sum:

```text
1 3 6 10
```

Formula:

```text
prefix[i] = prefix[i-1] + arr[i]
```

---

# Core Idea

Suppose:

```text
Current Prefix Sum = sum

Target = k
```

If:

```text
sum - k
```

already exists before,

then a valid subarray with sum = k exists.

Formula:

```text
currentSum - previousSum = k
```

Therefore:

```text
previousSum = currentSum - k
```

---

# Example

Array:

```text
1 1 1
```

Target:

```text
k = 2
```

---

## Prefix Sum

```text
Index   Element   PrefixSum

0         1          1

1         1          2

2         1          3
```

---

# Dry Run

Initialize:

```text
map = {0 : 1}

sum = 0

count = 0
```

---

Read 1

```text
sum = 1

sum - k = -1

Not found
```

Store:

```text
{0=1,1=1}
```

---

Read 1

```text
sum = 2

sum - k = 0

Found
```

Count:

```text
count = 1
```

Store:

```text
{0=1,1=1,2=1}
```

---

Read 1

```text
sum = 3

sum - k = 1

Found
```

Count:

```text
count = 2
```

Answer:

```text
2
```

---

# HashMap Structure

Store:

```text
Prefix Sum → Frequency
```

Example:

```text
{0=1,1=1,2=1,3=1}
```

Meaning:

```text
Prefix Sum 1 occurred once

Prefix Sum 2 occurred once

Prefix Sum 3 occurred once
```

---

# Most Important Problem

## LC 560 - Subarray Sum Equals K

Problem:

Count subarrays whose sum equals k.

---

## Optimal Solution

```java
import java.util.HashMap;

class Solution {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int sum = 0;

        int count = 0;

        for(int num : nums) {

            sum += num;

            if(map.containsKey(sum - k)) {

                count += map.get(sum - k);
            }

            map.put(
                sum,
                map.getOrDefault(sum,0)+1
            );
        }

        return count;
    }
}
```

---

# How The Code Works

Current Sum:

```text
sum
```

Needed Prefix:

```text
sum - k
```

If found:

```text
Valid Subarray Exists
```

Increase count.

Store current prefix sum in map.

Continue.

---

# Example 2

Array:

```text
3 4 7 2 -3 1 4 2
```

Target:

```text
7
```

Valid Subarrays:

```text
[3,4]

[7]

[7,2,-3,1]

[1,4,2]
```

Answer:

```text
4
```

---

# Prefix Sum Frequency

Array:

```text
1 -1 1 -1
```

Prefix Sums:

```text
1

0

1

0
```

Map:

```text
0 → 2

1 → 2
```

Frequency helps count multiple valid subarrays.

---

# Applications

### 1. Subarray Sum Equals K

LC 560

---

### 2. Count Subarrays With Given Sum

Very common interview question.

---

### 3. Continuous Subarray Sum

LC 523

---

### 4. Longest Subarray With Given Sum

Uses Prefix Sum + HashMap.

---

### 5. Zero Sum Subarray

Detect whether sum becomes zero.

---

# Key Points

- Prefix Sum stores cumulative sums.
- HashMap stores frequency of prefix sums.
- Check:

```text
currentSum - target
```

- If present → valid subarray found.
- Reduces O(n²) to O(n).
- One of the most important interview techniques.

---

# Complexity Analysis

| Operation | Complexity |
|------------|------------|
| Traversal | O(n) |
| HashMap Search | O(1) |
| HashMap Insert | O(1) |

Overall:

```text
Time Complexity : O(n)

Space Complexity : O(n)
```

---

# Interview Definition

Prefix Sum + Hashing is an optimization technique that uses cumulative sums and a HashMap to efficiently solve subarray sum problems in linear time.

---

# LeetCode Problems

```text
LC 724 - Find Pivot Index

LC 560 - Subarray Sum Equals K

LC 523 - Continuous Subarray Sum

LC 930 - Binary Subarrays With Sum

LC 525 - Contiguous Array
```

---

# Memory Trick

```text
Need subarray sum?

Store Prefix Sum.

Check:

currentSum - target

Found?

Valid Subarray Exists.
```

### One-Line Idea

👉 Prefix Sum + HashMap = Find previous prefix sums to instantly determine valid subarrays.