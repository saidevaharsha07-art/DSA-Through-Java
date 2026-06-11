# Level 3 - Print Prime Numbers in a Range

## Question 1

Write a Java program to print all prime numbers between two given numbers.

## Example

Input:
1 20

Output:
2 3 5 7 11 13 17 19

---

## Question 2

Write a Java program to count prime numbers in a given range.

## Example

Input:
1 20

Output:
8

---

## Question 3

Print all prime numbers from 1 to N using the Sieve of Eratosthenes.

## Example

Input:
30

Output:
2 3 5 7 11 13 17 19 23 29

---

## Logic

For Range Problems:

Check every number individually using the Prime Number function.

For Large Inputs:

Use Sieve of Eratosthenes.

The sieve marks multiples of prime numbers as non-prime.

Only unmarked numbers remain prime.

---

## Hint

Reusable Function:

```java
static boolean isPrime(int n)
```

Range:

```java
for(int i = start; i <= end; i++)
```

Sieve Array:

```java
boolean prime[] = new boolean[n + 1];
```

---

## Related Interview Questions

1. Count Primes
2. Prime Numbers in Range
3. Sieve of Eratosthenes
4. Prime Factorization
5. Closest Prime Numbers

---

## Why This Level?

Prime Number is one of the most important topics in DSA and Competitive Programming.

Most advanced Number Theory problems are built on prime concepts.