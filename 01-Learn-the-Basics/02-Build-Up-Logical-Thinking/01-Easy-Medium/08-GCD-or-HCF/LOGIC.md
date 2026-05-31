# 08 GCD or HCF

## Logic

GCD (Greatest Common Divisor) is the largest number that divides both numbers.

## Steps

1. Take inputs a and b.
2. Find the common divisors of both numbers.
3. The largest common divisor is the GCD.
4. Efficiently, use Euclid's Algorithm:
   - Replace a by b.
   - Replace b by a % b.
   - Repeat until b becomes 0.
5. The final value of a is the GCD.

## Example

Input: 12, 18

Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18

Output: 6
