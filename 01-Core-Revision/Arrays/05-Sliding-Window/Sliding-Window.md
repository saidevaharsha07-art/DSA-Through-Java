#  Sliding Window Technique

## Definition

Sliding Window is an optimization technique used to solve problems involving contiguous subarrays or substrings.

Instead of recalculating values for every subarray, we maintain a window and slide it through the array.

Time Complexity:
- O(n)

Space Complexity:
- O(1)

---

## Why Use Sliding Window?

Brute Force:

```java
for(int i = 0; i < n; i++) {
    for(int j = i; j < n; j++) {

    }
}
```

Time Complexity:

```text
O(n²)
```

Sliding Window:

```text
O(n)
```

Much faster for large inputs.

---

# Basic Idea

Maintain a window of size k.

Example:

```text
Array : 1 2 3 4 5 6

Window Size = 3

[1 2 3] 4 5 6

1 [2 3 4] 5 6

1 2 [3 4 5] 6

1 2 3 [4 5 6]
```

Instead of recalculating the sum every time:

```text
Remove outgoing element

Add incoming element
```

---

# Example 1 : Maximum Sum Subarray of Size K

Array:

```text
2 1 5 1 3 2
```

Window Size:

```text
3
```

Subarrays:

```text
2 + 1 + 5 = 8

1 + 5 + 1 = 7

5 + 1 + 3 = 9

1 + 3 + 2 = 6
```

Maximum Sum:

```text
9
```

---

## Java Program

```java
int arr[] = {2, 1, 5, 1, 3, 2};

int k = 3;

int windowSum = 0;

for(int i = 0; i < k; i++) {
    windowSum += arr[i];
}

int maxSum = windowSum;

for(int i = k; i < arr.length; i++) {

    windowSum = windowSum - arr[i - k];

    windowSum = windowSum + arr[i];

    maxSum = Math.max(maxSum, windowSum);
}

System.out.println(maxSum);
```

Output:

```text
9
```

---

# Dry Run

Array:

```text
2 1 5 1 3 2
```

Window Size:

```text
3
```

First Window:

```text
2 + 1 + 5 = 8
```

Slide Window:

```text
Remove 2

Add 1

1 + 5 + 1 = 7
```

Slide Again:

```text
Remove 1

Add 3

5 + 1 + 3 = 9
```

Slide Again:

```text
Remove 5

Add 2

1 + 3 + 2 = 6
```

Maximum:

```text
9
```

---

# Example 2 : Average of Every Subarray of Size K

Array:

```text
1 3 2 6 -1 4 1 8 2
```

Window Size:

```text
5
```

Java Program:

```java
int arr[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};

int k = 5;

int windowSum = 0;

for(int i = 0; i < k; i++) {
    windowSum += arr[i];
}

System.out.println((double)windowSum / k);

for(int i = k; i < arr.length; i++) {

    windowSum -= arr[i - k];

    windowSum += arr[i];

    System.out.println((double)windowSum / k);
}
```

---

# Fixed Size Sliding Window

Window size remains constant.

Example:

```text
Find maximum sum subarray of size 3.
```

Window:

```text
[1 2 3]

[2 3 4]

[3 4 5]
```

Size always remains 3.

---

# Variable Size Sliding Window

Window size changes based on conditions.

Example:

```text
Longest substring without repeating characters.
```

Window expands and shrinks dynamically.

Example:

```text
abcabcbb
```

Window grows:

```text
a

ab

abc
```

Duplicate found:

```text
Shrink window
```

Continue process.

---

# Working Diagram

```text
Array:

1 2 3 4 5 6

Window Size = 3

[1 2 3] 4 5 6

Remove 1

1 [2 3 4] 5 6

Remove 2

1 2 [3 4 5] 6

Remove 3

1 2 3 [4 5 6]
```

---

# Applications

### 1. Maximum Sum Subarray

Most common application.

### 2. Average of Subarrays

Calculate averages efficiently.

### 3. Longest Substring Problems

Used heavily in string questions.

### 4. Count Distinct Elements

Window-based frequency counting.

### 5. Interview Problems

Frequently asked in coding interviews.

---

# Key Points

- Used for contiguous subarrays/substrings.
- Avoids recalculating entire window.
- Add incoming element.
- Remove outgoing element.
- Fixed Window → Size remains constant.
- Variable Window → Size changes dynamically.
- Time Complexity = O(n).

---

## Interview Definition

Sliding Window is an optimization technique that maintains a subset of consecutive elements and updates the result by sliding the window instead of recalculating values repeatedly.

---

## Quick Example

Array:

```text
2 1 5 1 3 2
```

Window Size:

```text
3
```

Windows:

```text
2 1 5 → 8

1 5 1 → 7

5 1 3 → 9

1 3 2 → 6
```

Maximum:

```text
9
```

---

## Memory Trick

```text
Window moves one step at a time.

Remove old element.

Add new element.

Update answer.

Repeat.
```

### One-Line Idea

👉 Sliding Window = "Reuse previous calculations while moving through the array."