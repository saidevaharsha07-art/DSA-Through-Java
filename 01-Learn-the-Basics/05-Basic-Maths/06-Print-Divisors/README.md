# Print Divisors

## What are Divisors?

A divisor is a number that divides another number completely without leaving a remainder.

Examples:

Divisors of 12:

1, 2, 3, 4, 6, 12

Divisors of 15:

1, 3, 5, 15

---

## Why are Divisors Important?

Divisors are used in:

- Prime Number Problems
- GCD and LCM
- Number Theory
- Competitive Programming

---

## Core Logic

A number i is a divisor of n if:

```java
n % i == 0
```

This means n is completely divisible by i.

---

## Brute Force Approach

Check every number from 1 to n.

If it divides n completely, print it.

### Important Code

```java
for(int i = 1; i <= n; i++){
    if(n % i == 0){
        System.out.print(i + " ");
    }
}
```

---

## Dry Run

Input:

12

Checking:

12 % 1 = 0 ✓

12 % 2 = 0 ✓

12 % 3 = 0 ✓

12 % 4 = 0 ✓

12 % 5 ≠ 0 ✗

12 % 6 = 0 ✓

12 % 12 = 0 ✓

Output:

1 2 3 4 6 12

---

## Optimized Approach

Divisors always occur in pairs.

Example:

12

1 × 12

2 × 6

3 × 4

Instead of checking till n,
check only till √n.

When a divisor is found:

```java
i
```

its pair is:

```java
n / i
```

---

## Important Code

```java
for(int i = 1; i * i <= n; i++){

    if(n % i == 0){

        System.out.print(i + " ");

        if(i != n / i){
            System.out.print(n / i + " ");
        }
    }
}
```

---

## Mathematical Observation

Divisors occur in pairs.

Example:

36

1 × 36

2 × 18

3 × 12

4 × 9

6 × 6

After √36 = 6,
all remaining divisors are already discovered.

---

## Algorithm

1. Read n.
2. Traverse from 1 to √n.
3. If i divides n:
   - Print i.
   - Print n/i if different.
4. Stop.

---

## Important Edge Cases

### Case 1

Input:

1

Output:

1

### Case 2

Input:

13

Output:

1 13

Prime numbers have only two divisors.

### Case 3

Input:

36

Output:

1 2 3 4 6 9 12 18 36

---

## Time Complexity

Brute Force:

O(N)

Optimized:

O(√N)

---

## Space Complexity

O(1)

---

## Key Learning

✓ Divisibility

✓ Factor Pairs

✓ Square Root Optimization

✓ Number Theory Basics

Used in:

- Prime Number
- Perfect Number
- GCD Problems
- Factor Counting Problems
- Competitive Programming