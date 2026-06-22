# 03 Reverse a Number

## Logic

Extract digits one by one from the end and build the reversed number.

## Steps

1. Take input n.
2. Create rev = 0.
3. Find the last digit using n % 10.
4. Add the digit to rev using:
   rev = rev \* 10 + digit
5. Remove the last digit using n / 10.
6. Repeat until n becomes 0.
7. Print rev.

## Example

Input: 1234

Output: 4321
