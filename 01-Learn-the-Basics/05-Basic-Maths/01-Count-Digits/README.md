# Count Digits

## What is Count Digits?

Count Digits means finding how many digits are present in a given number.

Examples:

Input: 12345
Output: 5

Input: 987
Output: 3

Input: 0
Output: 1

---

## Real Life Analogy

Think of a number as a sequence of boxes.

12345

[1] [2] [3] [4] [5]

Total boxes = Total Digits = 5

---

## Core Logic

To count digits, repeatedly remove the last digit until the number becomes 0.

### Extract Last Digit

```java
int digit = n % 10;
```

### Remove Last Digit

```java
n = n / 10;
```

Every time we remove a digit, we increase the count.

---

## Dry Run

Input:

12345

Iteration 1

12345 → 1234

Count = 1

Iteration 2

1234 → 123

Count = 2

Iteration 3

123 → 12

Count = 3

Iteration 4

12 → 1

Count = 4

Iteration 5

1 → 0

Count = 5

Answer = 5

---

## Algorithm

1. Read the number.
2. Initialize count = 0.
3. While number > 0:
   - Remove last digit.
   - Increment count.
4. Print count.

---

## Important Edge Cases

### Case 1

Input:

0

Output:

1

Reason:
Zero itself contains one digit.

### Case 2

Input:

-12345

Output:

5

Reason:
Ignore the negative sign.

---

## Mathematical Observation

A number with:

1 digit → 0 to 9

2 digits → 10 to 99

3 digits → 100 to 999

4 digits → 1000 to 9999

and so on...

---

## Time Complexity

O(log₁₀N)

Because one digit is removed in every iteration.

---

## Space Complexity

O(1)

No extra space is used.

---

## Key Learning

After this problem, you should understand:

✓ Modulo Operator (%)

✓ Integer Division (/)

✓ While Loop

✓ Digit Extraction

✓ Digit Removal

These concepts will be used in:

- Reverse Number
- Palindrome Number
- Armstrong Number
- Sum of Digits
- Strong Number