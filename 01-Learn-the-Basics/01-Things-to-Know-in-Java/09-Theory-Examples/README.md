# ⏱️ Time and Space Complexity - Super Notes

## Why Do We Need Time Complexity?

A problem can have multiple solutions.

Time Complexity helps us:

```text
Compare Different Solutions
Choose Better Solution
Optimize Code
Crack Coding Interviews
```

Interviewers often judge solutions based on:

```text
Correctness
+
Time Complexity
+
Space Complexity
```

---

# What is Time Complexity?

Time Complexity measures:

```text
How the running time grows
with input size (N)
```

It does NOT mean:

```text
Actual seconds taken by a machine
```

Because:

```text
Different Machines
↓
Different Execution Times
```

Example:

```text
Old Laptop
↓
5 seconds

Gaming PC
↓
1 second
```

Same code.

Different time.

Hence:

```text
We measure Growth Rate
Not Actual Time
```

---

# Big O Notation

Time Complexity is represented using:

```text
O(...)
```

Examples:

```text
O(1)
O(log N)
O(N)
O(N log N)
O(N²)
O(N³)
```

---

# Example 1

```java
for(int i = 1; i <= N; i++){

    System.out.println(i);

}
```

Loop runs:

```text
N times
```

Time Complexity:

```text
O(N)
```

---

# Example 2

```java
for(int i = 0; i < N; i++){

    for(int j = 0; j < N; j++){

        System.out.println(i);

    }

}
```

Outer Loop:

```text
N times
```

Inner Loop:

```text
N times
```

Total:

```text
N × N
```

Time Complexity:

```text
O(N²)
```

---

# Three Important Rules

## Rule 1

Always Calculate Worst Case

---

### Best Case

Least Operations

Example:

```java
if(marks < 25)
```

Condition satisfied immediately.

---

### Worst Case

Maximum Operations

Example:

```java
if(marks < 25)
else if(...)
else if(...)
else if(...)
```

Last condition executes.

---

### Average Case

Between Best and Worst.

---

Interview Complexity:

```text
Always Worst Case
```

---

# Rule 2

Ignore Constants

Example:

```text
O(3N)
```

Becomes:

```text
O(N)
```

Example:

```text
O(100N)
```

Becomes:

```text
O(N)
```

---

# Rule 3

Ignore Smaller Terms

Example:

```text
O(N² + N)
```

Becomes:

```text
O(N²)
```

Because:

```text
N² grows much faster than N
```

---

# Examples

## Example

```text
O(N² + N + 10)
```

Remove:

```text
10
```

↓

```text
O(N² + N)
```

Remove:

```text
N
```

↓

Final:

```text
O(N²)
```

---

# Common Time Complexities

| Complexity | Name |
|------------|--------|
| O(1) | Constant |
| O(log N) | Logarithmic |
| O(N) | Linear |
| O(N log N) | Linearithmic |
| O(N²) | Quadratic |
| O(N³) | Cubic |
| O(2ⁿ) | Exponential |
| O(N!) | Factorial |

---

# O(1) - Constant

```java
int x = arr[5];
```

No matter input size.

Time:

```text
O(1)
```

---

# O(N) - Linear

```java
for(int i = 0; i < N; i++){

}
```

Time:

```text
O(N)
```

---

# O(N²) - Quadratic

```java
for(int i = 0; i < N; i++){

    for(int j = 0; j < N; j++){

    }

}
```

Time:

```text
O(N²)
```

---

# O(N³)

```java
for(int i = 0; i < N; i++){

    for(int j = 0; j < N; j++){

        for(int k = 0; k < N; k++){

        }

    }

}
```

Time:

```text
O(N³)
```

---

# Question 1

```java
for(int i = 0; i < N; i++){

    for(int j = 0; j < N; j++){

    }

}
```

Answer:

```text
O(N²)
```

---

# Question 2

```java
for(int i = 0; i < N; i++){

    for(int j = 0; j <= i; j++){

    }

}
```

Iterations:

```text
1 + 2 + 3 + ... + N
```

Formula:

```text
N(N+1)/2
```

Simplifies to:

```text
O(N²)
```

---

# What is Space Complexity?

Memory used by a program.

Represented using:

```text
O(...)
```

---

# Space Complexity Formula

```text
Space Complexity

=

Input Space

+

Auxiliary Space
```

---

# Input Space

Memory used to store input.

Example:

```java
int[] arr = new int[N];
```

Input Space:

```text
O(N)
```

---

# Auxiliary Space

Extra memory used to solve problem.

Example:

```java
int a;
int b;
int c;
```

Space:

```text
O(1)
```

---

# Example

```java
int a = 10;
int b = 20;
int c = a + b;
```

Variables:

```text
a
b
c
```

Space Complexity:

```text
O(1)
```

---

# Array Space Complexity

```java
int[] arr = new int[N];
```

Space Complexity:

```text
O(N)
```

---

# Good Coding Practice

❌ Bad

```java
b = a + b;
```

Modifies input.

---

✅ Good

```java
int c = a + b;
```

Keeps input unchanged.

---

# Online Judge Rule

Most Online Judges:

```text
10⁸ Operations
≈
1 Second
```

---

## Quick Estimation

| N | Preferred Complexity |
|----|----------------------|
| 10 | O(N!) |
| 20 | O(2ⁿ) |
| 100 | O(N³) |
| 10³ | O(N²) |
| 10⁵ | O(N log N) |
| 10⁶ | O(N) |
| 10⁸ | O(1) |

---

# Difference Between Time and Space Complexity

| Time Complexity | Space Complexity |
|-----------------|------------------|
| Measures Execution Time | Measures Memory Usage |
| O(N), O(N²) | O(1), O(N) |
| Performance | Memory |

---

# Viva Questions

### What is Time Complexity?

Rate at which execution time grows with input size.

---

### What is Big O?

Notation used to represent complexity.

---

### Why Ignore Constants?

They don't significantly affect growth.

---

### What is Worst Case Complexity?

Maximum time required by algorithm.

---

### What is Space Complexity?

Total memory used by program.

---

### What is Auxiliary Space?

Extra memory used apart from input.

---

### Why O(N²) for Nested Loops?

Because:

```text
N × N
=
N²
```

---

# 🚀 Last Minute Revision

```text
Time Complexity

O(1)
O(log N)
O(N)
O(N log N)
O(N²)
O(N³)

Rules:

1. Worst Case
2. Ignore Constants
3. Ignore Smaller Terms

Examples:

Single Loop → O(N)

Nested Loop → O(N²)

Triple Loop → O(N³)

Space Complexity

Input Space
+
Auxiliary Space

Variables → O(1)

Array Size N → O(N)

10⁸ Operations ≈ 1 Second
```