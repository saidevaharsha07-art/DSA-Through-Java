# 17 Perfect Number

## Logic

A number is perfect if the sum of its proper divisors is equal to the original number.

## Steps

1. Take input n.
2. Create sum = 0.
3. Run a loop from 1 to n / 2.
4. If n is divisible by i, add i to sum.
5. After the loop, compare sum with n.
6. If both are equal, it is a perfect number.
7. Otherwise, it is not a perfect number.

## Example

Input: 6

Divisors: 1 + 2 + 3 = 6

Output: Perfect Number
