# 09 - Fibonacci Number Using Recursion

## Problem Statement

Find the Nth Fibonacci Number using Recursion.

### Example

Input:

```text
N = 6
```

Output:

```text
8
```

---

## What is Fibonacci Series?

A Fibonacci series is a sequence where each number is the sum of the previous two numbers.

Series:

```text
0, 1, 1, 2, 3, 5, 8, 13, 21, ...
```

---

## Fibonacci Pattern

```text
F(0) = 0

F(1) = 1

F(2) = 1

F(3) = 2

F(4) = 3

F(5) = 5

F(6) = 8
```

Formula:

```text
F(N) = F(N-1) + F(N-2)
```

This is one of the most important recursion formulas in DSA.

---

## Understanding the Problem

To find:

```text
F(6)
```

We need:

```text
F(5) + F(4)
```

To find:

```text
F(5)
```

We need:

```text
F(4) + F(3)
```

To find:

```text
F(4)
```

We need:

```text
F(3) + F(2)
```

This process continues until reaching:

```text
F(1)

or

F(0)
```

---

## Recursive Formula

```text
F(N) = F(N-1) + F(N-2)
```

Base Cases:

```text
F(0) = 0

F(1) = 1
```

---

## Algorithm

1. If N is 0, return 0.
2. If N is 1, return 1.
3. Otherwise return:

```text
F(N-1) + F(N-2)
```

4. Continue until base cases are reached.

---

## Code

```java
import java.util.Scanner;

public class Main {

    static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Number = " + fibonacci(n));
    }
}
```

---

## Dry Run

Input:

```text
N = 4
```

Calculation:

```text
F(4)

=

F(3) + F(2)

=

(F(2)+F(1)) + (F(1)+F(0))

=

((F(1)+F(0))+1) + (1+0)

=

((1+0)+1)+(1+0)

=

3
```

Output:

```text
3
```

---

## Recursion Tree

For:

```text
F(5)
```

```text
                F(5)
              /      \
           F(4)      F(3)
          /   \      /   \
       F(3) F(2) F(2) F(1)
       / \   / \   / \
    F(2)F(1)F(1)F(0)F(1)F(0)
    / \
 F(1) F(0)
```

Notice:

```text
F(3)

is calculated multiple times

F(2)

is calculated multiple times
```

This causes inefficiency.

---

## Call Stack Visualization

For:

```text
F(4)
```

```text
F(4)

↓

F(3)

↓

F(2)

↓

F(1)

Base Case
```

and many additional branches are created.

Unlike previous recursion problems:

```text
One Function Call
```

Fibonacci creates:

```text
Two Recursive Calls
```

---

## Why Fibonacci is Different?

Previous problems:

```java
fun(n - 1)
```

Only one recursive call.

Fibonacci:

```java
fun(n - 1)

+

fun(n - 2)
```

Two recursive calls.

This is called:

```text
Branching Recursion
```

---

## Base Cases

```java
if(n <= 1){
    return n;
}
```

Equivalent to:

```java
if(n == 0)
    return 0;

if(n == 1)
    return 1;
```

Purpose:

Stops recursion.

---

## Time Complexity

This is where Fibonacci becomes important.

Recursive Calls:

```text
F(N-1)

+

F(N-2)
```

Tree grows exponentially.

Time Complexity:

```text
O(2^N)
```

Very expensive.

---

## Space Complexity

Maximum recursion depth:

```text
N
```

Therefore:

```text
O(N)
```

---

## Why is Fibonacci Slow?

Example:

```text
F(5)
```

Computes:

```text
F(3)
```

multiple times.

Computes:

```text
F(2)
```

multiple times.

Repeated calculations waste time.

---

## Optimized Iterative Solution

```java
int a = 0;
int b = 1;

for(int i = 2; i <= n; i++){

    int c = a + b;

    a = b;

    b = c;
}
```

Time Complexity:

```text
O(N)
```

Space Complexity:

```text
O(1)
```

Much faster.

---

## Fibonacci and Dynamic Programming

Because Fibonacci repeats calculations:

```text
F(3)

F(2)

F(1)
```

many times,

it becomes the first Dynamic Programming problem.

Optimization Methods:

```text
Memoization

Tabulation

Space Optimization
```

You will learn these later in DP.

---

## Common Mistakes

### 1. Wrong Base Case

Wrong:

```java
if(n == 1)
    return 1;
```

Missing:

```java
F(0)
```

Correct:

```java
if(n <= 1)
    return n;
```

---

### 2. Using Multiplication

Wrong:

```java
return fibonacci(n-1) * fibonacci(n-2);
```

Correct:

```java
return fibonacci(n-1) + fibonacci(n-2);
```

---

### 3. Confusing Fibonacci Series and Fibonacci Number

Series:

```text
0 1 1 2 3 5 8
```

Nth Fibonacci:

```text
Only one value
```

---

### 4. Ignoring Exponential Complexity

Recursive Fibonacci is simple but inefficient.

---

## Interview Questions

### Q1. What is the recursive formula?

```text
F(N) = F(N-1) + F(N-2)
```

---

### Q2. What are the base cases?

```text
F(0) = 0

F(1) = 1
```

---

### Q3. Why is Fibonacci called Branching Recursion?

Because each function creates two recursive calls.

---

### Q4. Time Complexity?

```text
O(2^N)
```

---

### Q5. Space Complexity?

```text
O(N)
```

---

### Q6. Why is recursive Fibonacci inefficient?

Repeated calculations occur.

Example:

```text
F(3)

F(2)
```

are computed multiple times.

---

### Q7. How can Fibonacci be optimized?

Using:

```text
Memoization

Tabulation

Space Optimization
```

---

### Q8. Which approach is best in practice?

Iterative solution.

Time:

```text
O(N)
```

Space:

```text
O(1)
```

---

## Real Interview Insight

Fibonacci is not asked because it is difficult.

It is asked because it teaches:

```text
Recursion Tree

Branching Recursion

Overlapping Subproblems

Dynamic Programming Foundation
```

Understanding Fibonacci makes DP much easier later.

---

## Key Learning

This problem introduces:

```text
Branching Recursion

Recursion Tree

Overlapping Subproblems

Dynamic Programming Basics
```

Unlike previous recursion problems:

```text
One Recursive Call
```

Fibonacci uses:

```text
Two Recursive Calls
```

which increases complexity dramatically.

---

## Quick Revision Notes

```text
Goal:
Find Nth Fibonacci Number

Formula:
F(N) = F(N-1) + F(N-2)

Base Cases:
F(0) = 0
F(1) = 1

Type:
Branching Recursion

Time Complexity:
O(2^N)

Space Complexity:
O(N)

Optimization:
Memoization
Tabulation
Iterative Approach

Important Concepts:
✔ Branching Recursion
✔ Recursion Tree
✔ Overlapping Subproblems
✔ Dynamic Programming Foundation

Common Errors:
❌ Wrong Base Case
❌ Multiplication Instead of Addition
❌ Ignoring Repeated Calculations
```