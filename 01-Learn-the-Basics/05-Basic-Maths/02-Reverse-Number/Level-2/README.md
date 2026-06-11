
---

### `02-Reverse-Number/Level-2/README.md`

```md
# Level 2 - Reverse Number with Edge Cases

## Question
Write a Java program to reverse:
- positive numbers
- negative numbers
- numbers ending with zeros

## Example
Input:
-123

Output:
-321

Input:
1000

Output:
1

## Logic
Store the sign separately.

Reverse only the absolute value.

Attach the sign back at the end.

## Hint
Use:

```java
int sign = (n < 0) ? -1 : 1;
n = Math.abs(n);