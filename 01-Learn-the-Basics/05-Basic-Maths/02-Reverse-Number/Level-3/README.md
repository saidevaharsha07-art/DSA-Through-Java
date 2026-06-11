# Level 3 - Reverse Number and Check Overflow

## Question
Write a Java program to reverse a number.

If the reversed number exceeds Integer range,
print an appropriate message.

## Example
Input:
2147483647

Output:
Overflow

## Logic
Before adding a digit,
check whether the reversed number is within Integer limits.

## Hint
Use:

```java
if(rev > Integer.MAX_VALUE / 10)