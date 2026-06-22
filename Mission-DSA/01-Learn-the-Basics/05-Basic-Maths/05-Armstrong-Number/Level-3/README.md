# Level 3 - Find Armstrong Numbers in a Range

## Question

Write a Java program to print all Armstrong Numbers between two given numbers.

## Example

Input:
1 1000

Output:
1 2 3 4 5 6 7 8 9 153 370 371 407

## Logic

Traverse through every number in the range.

For each number:

1. Count digits
2. Calculate Armstrong sum
3. Compare with original number
4. Print if valid

## Hint

Use a helper function:

```java
static boolean isArmstrong(int n)
```

Then:

```java
for(int i = start; i <= end; i++)
```

Check every number.

## Related Interview Questions

1. Print Armstrong Numbers in Range
2. Count Armstrong Numbers in Range
3. Find Next Armstrong Number

## Why This Level?

Instead of checking a single number,
you learn how to reuse logic using functions and loops.