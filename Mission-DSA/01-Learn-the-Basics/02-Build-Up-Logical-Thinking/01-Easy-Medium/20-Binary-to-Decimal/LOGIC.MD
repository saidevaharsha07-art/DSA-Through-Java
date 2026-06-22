# 20 Binary to Decimal

## Logic

Convert binary to decimal by multiplying each binary digit with powers of 2.

## Steps

1. Take binary input n.
2. Create decimal = 0 and power = 0.
3. Extract last digit using n % 10.
4. Multiply digit with 2^power.
5. Add the result to decimal.
6. Increase power by 1.
7. Remove the last digit using n / 10.
8. Repeat until n becomes 0.
9. Print decimal.

## Formula

decimal = digit × 2^power

## Example

Input: 1010

Calculation:
0 × 2⁰ + 1 × 2¹ + 0 × 2² + 1 × 2³ = 10

Output: 10
