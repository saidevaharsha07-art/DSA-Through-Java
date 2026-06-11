
---

### `01-Count-Digits/Level-3/README.md`

```md
# Level 3 - Count Digits Using Math Formula

## Question
Write a Java program to count digits without using a loop.

## Example
Input:
98765

Output:
5

## Logic
Use logarithm formula:

digits = floor(log10(n)) + 1

## Hint
Use:

```java
int digits = (int)(Math.log10(n)) + 1;