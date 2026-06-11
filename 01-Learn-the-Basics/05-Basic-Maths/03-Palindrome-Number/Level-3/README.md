
---

### `03-Palindrome-Number/Level-3/README.md`

```md
# Level 3 - Palindrome Without Reversing Entire Number

## Question

Write a Java program to check whether a number is a palindrome without reversing the complete number.

## Example

Input:
1221

Output:
Palindrome

Input:
1234

Output:
Not Palindrome

## Logic

Instead of reversing the entire number:

- Reverse only half of the digits.
- Compare the first half and second half.

This reduces unnecessary operations.

## Hint

Keep building the reversed half.

```java
while(n > rev){
    rev = rev * 10 + n % 10;
    n /= 10;
}