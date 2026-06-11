# Level 3 - GCD of Multiple Numbers

## Question

Write a Java program to find the GCD of N numbers.

## Example

Input:
3
12 18 24

Output:
6

## Logic

First find:

GCD(12,18)

Then:

GCD(result,24)

Continue until all numbers are processed.

## Hint

Create a reusable function:

```java
static int gcd(int a, int b)
```

Use:

```java
ans = gcd(ans, arr[i]);
```

## Related Interview Questions

1. GCD of Array
2. Delete One Element to Maximize GCD
3. Find Common Divisor of Multiple Numbers

## Why This Level?

Many competitive programming problems require finding GCD for an entire array instead of only two numbers.