# 06 Armstrong Number

## Logic

A number is an Armstrong number if the sum of its digits raised to the power of the total number of digits is equal to the original number.

## Steps

1. Take input n.
2. Store the original number.
3. Count the total number of digits.
4. Extract each digit using n % 10.
5. Raise the digit to the power of count.
6. Add the result to sum.
7. Remove the digit using n / 10.
8. Repeat until n becomes 0.
9. Compare sum with the original number.
10. If both are equal, it is an Armstrong number.

## Example

Input: 153

1³ + 5³ + 3³ = 153

Output: Armstrong Number
