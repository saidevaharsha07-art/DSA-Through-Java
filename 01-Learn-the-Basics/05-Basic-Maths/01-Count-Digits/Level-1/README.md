# Level 1 - Basic Count Digits

## Question
Write a Java program to count the number of digits in a positive number.

## Example
Input:
12345

Output:
5

## Logic
Keep dividing the number by 10 until it becomes 0.

Every division removes one digit.

## Hint
Use:

```java
n = n / 10;
count++;