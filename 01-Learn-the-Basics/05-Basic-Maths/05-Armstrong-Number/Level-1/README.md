# Level 1 - Check Armstrong Number

## Question

Write a Java program to check whether a given number is an Armstrong Number or not.

## Example

Input:
153

Output:
Armstrong Number

Input:
123

Output:
Not Armstrong Number

## Logic

1. Count the number of digits.
2. Extract each digit.
3. Raise the digit to the power of total digits.
4. Add all values.
5. Compare the sum with the original number.

## Hint

Use:

```java
Math.pow(digit, count)
```

Compare:

```java
if(sum == original)
```