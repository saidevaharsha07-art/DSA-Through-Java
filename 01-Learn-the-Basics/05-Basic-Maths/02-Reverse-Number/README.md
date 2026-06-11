# Reverse Number

## What is Reverse Number?

Reverse Number means reversing the order of digits in a number.

Examples:

Input: 12345

Output: 54321

Input: 987

Output: 789

---

## Real Life Analogy

Think of a queue of people.

Original:

1 2 3 4 5

Reversed:

5 4 3 2 1

The first becomes last and the last becomes first.

---

## Core Logic

To reverse a number:

1. Extract the last digit.
2. Add it to the reversed number.
3. Remove the last digit.
4. Repeat until the number becomes 0.

### Extract Last Digit

```java
int digit = n % 10;
```

### Remove Last Digit

```java
n = n / 10;
```

### Build Reverse Number

```java
rev = rev * 10 + digit;
```

---

## Dry Run

Input:

1234

Initial:

rev = 0

Step 1

digit = 4

rev = 0 × 10 + 4 = 4

n = 123

Step 2

digit = 3

rev = 4 × 10 + 3 = 43

n = 12

Step 3

digit = 2

rev = 43 × 10 + 2 = 432

n = 1

Step 4

digit = 1

rev = 432 × 10 + 1 = 4321

n = 0

Answer = 4321

---

## Algorithm

1. Read number n.
2. Initialize rev = 0.
3. While n > 0:
   - Extract last digit.
   - Add digit to reverse.
   - Remove last digit.
4. Print rev.

---

## Important Edge Cases

### Case 1

Input:

0

Output:

0

### Case 2

Input:

1000

Output:

1

Leading zeros are automatically removed.

### Case 3

Input:

-123

Output:

-321

Negative sign remains negative.

---

## Mathematical Observation

Every iteration:

```java
rev = rev * 10 + digit;
```

shifts existing digits left and adds the new digit at the end.

Example:

4 → 43 → 432 → 4321

---

## Time Complexity

O(log₁₀N)

---

## Space Complexity

O(1)

---

## Key Learning

After this problem, you should understand:

✓ Digit Extraction

✓ Digit Removal

✓ Number Construction

✓ While Loop Practice

✓ Mathematical Manipulation

These concepts will be used in:

- Palindrome Number
- Armstrong Number
- Strong Number
- Integer Manipulation Problems
