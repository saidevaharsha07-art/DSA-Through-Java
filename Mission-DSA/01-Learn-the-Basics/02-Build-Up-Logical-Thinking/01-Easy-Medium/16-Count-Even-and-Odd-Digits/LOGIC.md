# 16 Count Even and Odd Digits

## Logic

Check each digit of the number and count whether it is even or odd.

## Steps

1. Take input n.
2. Create even = 0 and odd = 0.
3. Extract the last digit using n % 10.
4. Check if digit % 2 == 0.
5. If true, increase even count.
6. Otherwise, increase odd count.
7. Remove the last digit using n / 10.
8. Repeat until n becomes 0.
9. Print even and odd counts.

## Example

Input: 12345

Even digits: 2
Odd digits: 3
