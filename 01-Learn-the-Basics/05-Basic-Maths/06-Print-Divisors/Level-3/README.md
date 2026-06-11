# Level 3 - Count and Sum of Divisors

## Question 1

Write a Java program to count the total number of divisors of a number.

## Example

Input:
12

Output:
6

Explanation:

1, 2, 3, 4, 6, 12

Total Divisors = 6

---

## Question 2

Write a Java program to find the sum of all divisors of a number.

## Example

Input:
12

Output:
28

Explanation:

1 + 2 + 3 + 4 + 6 + 12 = 28

---

## Logic

Use the square root optimization.

Whenever a divisor is found:

```java
i
```

its pair:

```java
n / i
```

should also be considered.

---

## Hint

Count:

```java
count++;
```

Sum:

```java
sum += i;
```

Remember to handle perfect squares separately.

Example:

36

Do not count:

```java
6 and 6
```

twice.

## Related Interview Questions

1. Count Divisors
2. Sum of Divisors
3. Highly Composite Numbers
4. Number of Factors in N!

## Why This Level?

Many coding contests ask for divisor count or divisor sum instead of simply printing divisors.