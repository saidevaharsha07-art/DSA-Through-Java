
---

### `01-Count-Digits/Level-2/README.md`

```md
# Level 2 - Count Digits with Edge Cases

## Question
Write a Java program to count digits for:
- positive numbers
- zero
- negative numbers

## Example
Input:
-1234

Output:
4

Input:
0

Output:
1

## Logic
If number is 0, digit count is 1.

If number is negative, convert it to positive before counting.

## Hint
Use:

```java
n = Math.abs(n);
```