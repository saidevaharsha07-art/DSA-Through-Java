# Greatest Common Divisor (GCD)

## What is GCD?

The Greatest Common Divisor (GCD) is the largest number that divides two or more numbers without leaving a remainder.

Examples:

GCD(12, 18) = 6

GCD(20, 30) = 10

GCD(7, 13) = 1

---

## Why is GCD Important?

GCD is used in:

- Fractions Simplification
- Number Theory
- Competitive Programming
- LCM Problems
- Modular Arithmetic

---

## Core Logic

Instead of checking every factor, we use Euclid's Algorithm.

Rule:

GCD(a, b) = GCD(b, a % b)

Repeat until b becomes 0.

The remaining value of a is the answer.

---

## Important Code

```java
while(b != 0){
    int rem = a % b;
    a = b;
    b = rem;
}
```

Answer:

```java
System.out.println(a);
```

---

## Dry Run

Input:

12 18

Step 1

a = 12

b = 18

rem = 12 % 18 = 12

a = 18

b = 12

Step 2

rem = 18 % 12 = 6

a = 12

b = 6

Step 3

rem = 12 % 6 = 0

a = 6

b = 0

Answer = 6

---

## Algorithm

1. Read a and b.
2. While b is not 0:
   - Find remainder.
   - Update a and b.
3. Print a.

---

## Important Edge Cases

### Case 1

Input:

10 10

Output:

10

### Case 2

Input:

5 0

Output:

5

### Case 3

Input:

0 7

Output:

7

### Case 4

Input:

7 13

Output:

1

Co-prime numbers have GCD = 1.

---

## Mathematical Observation

If a number divides both numbers completely,
it must also divide their remainder.

This is the reason Euclid's Algorithm works.

---

## Time Complexity

O(log(min(a,b)))

---

## Space Complexity

O(1)

---

## Key Learning

✓ Euclid's Algorithm

✓ Modulo Operator

✓ Number Theory Basics

✓ Efficient Problem Solving

Used in:

- LCM Problems
- Fraction Simplification
- Modular Arithmetic
- Competitive Programming