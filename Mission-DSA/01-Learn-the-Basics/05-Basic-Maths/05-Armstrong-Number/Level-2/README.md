# Level 2 - Armstrong Number with Edge Cases

## Question

Write a Java program to check Armstrong Numbers including:

- Single digit numbers
- Large Armstrong numbers
- Zero

## Example

Input:
0

Output:
Armstrong Number

Input:
9474

Output:
Armstrong Number

## Logic

Every single digit number is an Armstrong Number because:

n¹ = n

Example:

5¹ = 5

## Hint

First count the digits.

Then calculate:

```java
sum += Math.pow(digit, count);
```

Handle 0 correctly.