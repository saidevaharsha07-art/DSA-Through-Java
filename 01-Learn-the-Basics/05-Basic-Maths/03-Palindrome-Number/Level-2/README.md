
---

### `03-Palindrome-Number/Level-2/README.md`

```md
# Level 2 - Palindrome Number with Edge Cases

## Question

Write a Java program to check palindrome numbers including:

- Single digit numbers
- Negative numbers
- Numbers ending with zero

## Example

Input:
7

Output:
Palindrome

Input:
-121

Output:
Not Palindrome

Input:
10

Output:
Not Palindrome

## Logic

A negative number cannot be a palindrome because of the '-' sign.

A number ending with 0 cannot be a palindrome unless the number itself is 0.

## Hint

Check edge cases before reversing.

```java
if(n < 0)