# Level 1 - Find GCD of Two Numbers

## Question

Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

## Example

Input:
12 18

Output:
6

## Logic

Find all common factors and return the greatest one.

## Hint

Check every number from 1 to min(a,b).

```java
if(a % i == 0 && b % i == 0)
```

Store the latest common divisor.