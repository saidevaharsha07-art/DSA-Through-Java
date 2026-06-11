# Level 2 - Prime Number Using Square Root Optimization

## Question

Write a Java program to check whether a number is prime using an optimized approach.

## Example

Input:
29

Output:
Prime Number

## Logic

If a number has a factor,
at least one factor must be less than or equal to √N.

Therefore checking until √N is enough.

## Hint

Use:

```java
for(int i = 2; i * i <= n; i++)
```

If any divisor is found:

```java
n % i == 0
```

the number is not prime.

Stop immediately.