# Prime Number

## What is a Prime Number?

A Prime Number is a number that has exactly two factors:

1 and itself

Examples:

2 → Prime

3 → Prime

5 → Prime

7 → Prime

11 → Prime

12 → Not Prime

15 → Not Prime

---

## Conditions

A Prime Number:

✓ Has exactly 2 factors

✓ Divisible only by 1 and itself

A Non-Prime Number:

✗ Has more than 2 factors

---

## Examples

Prime Numbers:

2, 3, 5, 7, 11, 13, 17

Non-Prime Numbers:

4, 6, 8, 9, 10, 12

---

## Core Logic

Count the number of divisors.

If the count is exactly 2:

Prime Number

Otherwise:

Not Prime Number

---

## Brute Force Approach

Check every number from 1 to n.

Count how many numbers divide n completely.

### Important Code

```java
int count = 0;

for(int i = 1; i <= n; i++){
    if(n % i == 0){
        count++;
    }
}
```

Check:

```java
if(count == 2)
```

---

## Dry Run

Input:

13

Factors:

1, 13

Count = 2

Output:

Prime Number

---

## Optimized Approach

Divisors occur in pairs.

Instead of checking till n,
check only till √n.

Example:

36

1 × 36

2 × 18

3 × 12

4 × 9

6 × 6

No need to check after √36.

---

## Important Code

```java
int count = 0;

for(int i = 1; i * i <= n; i++){

    if(n % i == 0){

        count++;

        if(i != n / i){
            count++;
        }
    }
}
```

Check:

```java
if(count == 2)
```

---

## Better Interview Approach

Instead of counting divisors,
stop immediately when a divisor is found.

```java
boolean prime = true;

for(int i = 2; i * i <= n; i++){

    if(n % i == 0){
        prime = false;
        break;
    }
}
```

---

## Algorithm

1. Read number n.
2. Check divisibility from 2 to √n.
3. If any divisor exists:
   - Not Prime
4. Otherwise:
   - Prime

---

## Important Edge Cases

### Case 1

Input:

1

Output:

Not Prime

Reason:
Prime numbers start from 2.

### Case 2

Input:

2

Output:

Prime

Smallest Prime Number.

### Case 3

Input:

0

Output:

Not Prime

### Case 4

Input:

13

Output:

Prime

### Case 5

Input:

15

Output:

Not Prime

---

## Mathematical Observation

Every non-prime number has at least one factor less than or equal to √n.

That is why checking till √n is enough.

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

✓ Factors

✓ Square Root Optimization

✓ Early Termination

✓ Number Theory Basics

Used in:

- Prime Factorization
- Sieve of Eratosthenes
- GCD Problems
- Competitive Programming
- Number Theory