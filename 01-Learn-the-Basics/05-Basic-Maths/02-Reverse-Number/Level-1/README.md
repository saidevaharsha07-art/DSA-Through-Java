# Level 1 - Reverse a Number

## Question
Write a Java program to reverse a positive integer.

## Example
Input:
1234

Output:
4321

## Logic
Extract the last digit and add it to the reversed number.

Continue until the number becomes 0.

## Hint
Use:

```java
digit = n % 10;
rev = rev * 10 + digit;
n = n / 10;