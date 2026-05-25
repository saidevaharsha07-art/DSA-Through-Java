#  Kadane's Algorithm

## Definition

Kadane's Algorithm is an efficient technique used to find the Maximum Sum Subarray in an array.

Instead of checking all possible subarrays, it calculates the maximum subarray sum in a single traversal.

Time Complexity:
- O(n)

Space Complexity:
- O(1)

---

## Problem Statement

Given an array, find the contiguous subarray with the largest sum.

Example:

```java
int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
```

Output:

```text
6
```

Maximum Sum Subarray:

```text
4 + (-1) + 2 + 1 = 6
```

---

# Idea Behind Kadane's Algorithm

At every index:

- Add current element to current sum.
- Update maximum sum if current sum becomes larger.
- If current sum becomes negative, reset it to 0.

Reason:

A negative running sum will only decrease future subarray sums.

---

## Algorithm Steps

1. Initialize currentSum = 0
2. Initialize maxSum = Integer.MIN_VALUE
3. Traverse the array
4. Add current element to currentSum
5. Update maxSum
6. If currentSum < 0, reset currentSum = 0
7. Return maxSum

---

## Dry Run

Array:

```text
-2   1   -3   4   -1   2   1   -5   4
```

| Element | Current Sum | Max Sum |
|----------|------------|----------|
| -2 | -2 | -2 |
| Reset | 0 | -2 |
| 1 | 1 | 1 |
| -3 | -2 | 1 |
| Reset | 0 | 1 |
| 4 | 4 | 4 |
| -1 | 3 | 4 |
| 2 | 5 | 5 |
| 1 | 6 | 6 |
| -5 | 1 | 6 |
| 4 | 5 | 6 |

Answer:

```text
6
```

---

## Java Program

```java
int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

int currentSum = 0;
int maxSum = Integer.MIN_VALUE;

for(int i = 0; i < arr.length; i++) {

    currentSum += arr[i];

    if(currentSum > maxSum) {
        maxSum = currentSum;
    }

    if(currentSum < 0) {
        currentSum = 0;
    }
}

System.out.println(maxSum);
```

Output:

```text
6
```

---

## Simple Version

```java
int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

int currentSum = 0;
int maxSum = Integer.MIN_VALUE;

for(int num : arr) {

    currentSum += num;

    maxSum = Math.max(maxSum, currentSum);

    if(currentSum < 0) {
        currentSum = 0;
    }
}

System.out.println(maxSum);
```

Output:

```text
6
```

---

# Example 2

Array:

```text
1 2 3 4 5
```

Subarray:

```text
1 + 2 + 3 + 4 + 5
```

Maximum Sum:

```text
15
```

Output:

```text
15
```

---

# Example 3

Array:

```text
-1 -2 -3 -4
```

Maximum Sum:

```text
-1
```

Output:

```text
-1
```

---

# Why Reset Current Sum?

Example:

```text
4 + (-10) + 5
```

Running Sum:

```text
4
-6
```

The sum becomes negative.

Starting fresh from:

```text
5
```

is always better than continuing with:

```text
-6 + 5
```

Therefore:

```java
if(currentSum < 0) {
    currentSum = 0;
}
```

---

# Applications of Kadane's Algorithm

### 1. Maximum Subarray Sum

Most common application.

### 2. Stock Market Analysis

Finding maximum profit intervals.

### 3. Dynamic Programming Problems

Used as a foundation for many DP problems.

### 4. Competitive Programming

Frequently asked in coding interviews and contests.

---

# Key Points

- Finds Maximum Sum Subarray.
- Uses a single traversal.
- Time Complexity = O(n)
- Space Complexity = O(1)
- Reset current sum when it becomes negative.
- Much faster than brute force O(n²) or O(n³).

---

## Interview Definition

Kadane's Algorithm is an efficient algorithm used to find the maximum sum contiguous subarray in linear time by maintaining a running sum and resetting it whenever it becomes negative.

---

## Quick Example

Array:

```text
-2 1 -3 4 -1 2 1 -5 4
```

Maximum Sum Subarray:

```text
4 + (-1) + 2 + 1
```

Result:

```text
6
```

---

## Memory Trick

```text
Add elements continuously.

If sum becomes negative:
Discard it and start again.

Keep track of the largest sum seen so far.
```

### One-Line Idea

👉 Kadane's Algorithm = "Keep the positive running sum, discard the negative running sum."