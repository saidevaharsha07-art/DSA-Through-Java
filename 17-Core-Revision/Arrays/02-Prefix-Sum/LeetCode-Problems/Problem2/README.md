# 560. Subarray Sum Equals K

## Difficulty
Medium

## Problem Statement

Given an array of integers `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals `k`.

A subarray is a contiguous non-empty sequence of elements within an array.

---

## Example 1

### Input

```text
nums = [1,1,1]
k = 2
```

### Output

```text
2
```

### Explanation

```text
Subarrays with sum = 2

[1,1]  (index 0 to 1)

[1,1]  (index 1 to 2)
```

Answer:

```text
2
```

---

## Example 2

### Input

```text
nums = [1,2,3]
k = 3
```

### Output

```text
2
```

### Explanation

```text
[1,2]

[3]
```

Answer:

```text
2
```

---

## Approach 1 : Brute Force

### Idea

Generate all possible subarrays.

Calculate their sum.

Whenever sum equals `k`, increment count.

---

## Pseudocode

```text
count = 0

for i = 0 to n-1

    sum = 0

    for j = i to n-1

        sum += nums[j]

        if sum == k
            count++

return count
```

---

## Brute Force Solution

```java
class Solution {

    public int subarraySum(int[] nums, int k) {

        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            int sum = 0;

            for(int j = i; j < nums.length; j++) {

                sum += nums[j];

                if(sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
```

### Complexity Analysis

```text
Time Complexity : O(n²)

Space Complexity : O(1)
```

---

# Approach 2 : Prefix Sum + HashMap (Optimal)

## Idea

Instead of checking every subarray:

Store prefix sums in a HashMap.

If:

```text
currentPrefixSum - k
```

already exists in the map,

then a valid subarray ending at the current index exists.

Count all such occurrences.

---

## Formula

```text
currentSum - previousSum = k

previousSum = currentSum - k
```

---

## Dry Run

### Input

```text
nums = [1,1,1]

k = 2
```

Initialize:

```text
map = {0 : 1}

sum = 0

count = 0
```

---

### Element = 1

```text
sum = 1

sum - k = -1

Not present
```

Store:

```text
map = {0:1, 1:1}
```

---

### Element = 1

```text
sum = 2

sum - k = 0

Found in map
```

Count:

```text
count = 1
```

Store:

```text
map = {0:1,1:1,2:1}
```

---

### Element = 1

```text
sum = 3

sum - k = 1

Found in map
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

## Optimal Solution

```java
import java.util.HashMap;

class Solution {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;

        int count = 0;

        for(int num : nums) {

            sum += num;

            if(map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum,
                    map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
```

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity : O(n)
```

---

# Key Observations

- Prefix Sum helps track cumulative sums.
- HashMap stores frequency of prefix sums.
- If (currentSum - k) exists, a valid subarray is found.
- Works for positive, negative and zero values.
- Most commonly asked Prefix Sum + HashMap interview problem.

---

# Topics

- Arrays
- Prefix Sum
- HashMap
- Sliding Window (related concept)

---

# Interview Definition

Subarray Sum Equals K asks us to count the number of continuous subarrays whose sum equals a target value k.

The optimal solution uses Prefix Sum and HashMap to reduce time complexity from O(n²) to O(n).

---

# LeetCode Link

https://leetcode.com/problems/subarray-sum-equals-k/

---

# Memory Trick

```text
Need subarray sum = k ?

Store Prefix Sum.

Check:

currentSum - k

Exists?

Yes → Valid Subarray Found.
```

### One-Line Idea

👉 Prefix Sum + HashMap = Find previous sums that can form target sum `k`.