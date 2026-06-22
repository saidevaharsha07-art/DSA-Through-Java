# Armstrong Number

## What is an Armstrong Number?

An Armstrong Number is a number that is equal to the sum of its digits raised to the power of the total number of digits.

Examples:

153 → Armstrong Number

370 → Armstrong Number

371 → Armstrong Number

9474 → Armstrong Number

123 → Not an Armstrong Number

---

## Formula

For a number having n digits:

Sum of (each digit)n

If the sum equals the original number,
then it is an Armstrong Number.

Example:

153

Number of digits = 3

1³ + 5³ + 3³

= 1 + 125 + 27

= 153

Therefore Armstrong Number.

---

## Core Logic

1. Count the digits in the number.
2. Extract each digit.
3. Raise the digit to the power of total digits.
4. Add all values.
5. Compare the sum with the original number.

---

## Important Code

### Count Digits

```java
while(temp > 0){
    count++;
    temp /= 10;
}
```

### Armstrong Sum

```java
sum += Math.pow(digit, count);
```

### Check

```java
if(sum == original)
```

---

## Dry Run

Input:

153

Digits = 3

1³ + 5³ + 3³

= 1 + 125 + 27

= 153

Compare:

153 == 153

Output:

Armstrong Number

---

## Algorithm

1. Read number n.
2. Count total digits.
3. Extract each digit.
4. Add digit^count to sum.
5. Compare sum and original number.
6. Print result.

---

## Important Edge Cases

### Case 1

Input:

0

Output:

Armstrong Number

### Case 2

Input:

1

Output:

Armstrong Number

### Case 3

Input:

9474

Output:

Armstrong Number

Because:

9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474

---

## Mathematical Observation

Every Armstrong Number satisfies:

Number = Sum of (Digit ^ Total Digits)

---

## Time Complexity

O(log₁₀N)

---

## Space Complexity

O(1)

---

## Key Learning

✓ Digit Extraction

✓ Counting Digits

✓ Power Calculations

✓ Mathematical Properties of Numbers

Used in:

- Number Theory
- Digit Manipulation Problems
- Mathematical Pattern Problems