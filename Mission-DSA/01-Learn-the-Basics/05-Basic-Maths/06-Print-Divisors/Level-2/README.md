# Level 2 - Print Divisors Using Square Root Optimization

## Question

Write a Java program to print all divisors of a number using an optimized approach.

## Example

Input:
36

Output:
1 2 3 4 6 9 12 18 36

## Logic

Divisors always occur in pairs.

Example:

1 × 36

2 × 18

3 × 12

4 × 9

6 × 6

Check only till √n.

## Hint

Use:

```java
for(int i = 1; i * i <= n; i++)
```

Whenever a divisor is found:

```java
i
```

and

```java
n / i
```

are both divisors.