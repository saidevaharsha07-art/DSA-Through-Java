# 19 Decimal to Binary

## Logic

Convert decimal to binary by repeatedly dividing the number by 2 and storing the remainders.

## Steps

1. Take decimal input n.
2. Create binary = 0 and place = 1.
3. Find remainder using n % 2.
4. Add remainder to binary using:
   binary = binary + remainder × place
5. Update place = place × 10.
6. Divide n by 2.
7. Repeat until n becomes 0.
8. Print binary.

## Example

Input: 10

Remainders: 0 1 0 1

Output: 1010
