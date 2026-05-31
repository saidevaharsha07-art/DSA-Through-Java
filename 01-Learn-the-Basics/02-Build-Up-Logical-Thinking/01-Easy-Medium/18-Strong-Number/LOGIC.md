# 18 Strong Number

## Logic

A number is strong if the sum of factorials of its digits is equal to the original number.

## Steps

1. Take input n.
2. Store the original number.
3. Extract each digit using n % 10.
4. Find factorial of each digit.
5. Add each factorial to sum.
6. Remove the last digit using n / 10.
7. Repeat until n becomes 0.
8. Compare sum with the original number.
9. If both are equal, it is a strong number.

## Example

Input: 145

1! + 4! + 5! = 145

Output: Strong Number
