# Palindrome Number

## What is a Palindrome Number?

A Palindrome Number is a number that remains the same when its digits are reversed.

Examples:

121 → Palindrome

1331 → Palindrome

123 → Not a Palindrome

---

## Core Logic

1. Store the original number.
2. Reverse the number.
3. Compare the reversed number with the original number.
4. If both are equal, it is a palindrome.

---

## Important Code

### Store Original Number

```java
int temp = n;
```

### Reverse Number

```java
while(n > 0){
    int digit = n % 10;
    rev = rev * 10 + digit;
    n = n / 10;
}
```

### Compare

```java
if(temp == rev)
```

---

## Dry Run

Input:

121

Initial:

temp = 121

rev = 0

Step 1:

digit = 1

rev = 1

n = 12

Step 2:

digit = 2

rev = 12

n = 1

Step 3:

digit = 1

rev = 121

n = 0

Compare:

121 == 121

Output:

Palindrome

---

## Algorithm

1. Read number n.
2. Store original number in temp.
3. Reverse the number.
4. Compare temp and reverse.
5. Print result.

---

## Important Edge Cases

### Case 1

Input:

0

Output:

Palindrome

### Case 2

Input:

7

Output:

Palindrome

A single digit is always a palindrome.

### Case 3

Input:

10

Output:

Not Palindrome

Reverse becomes 1.

---

## Time Complexity

O(log₁₀N)

---

## Space Complexity

O(1)

---

## Key Learning

✓ Reusing Reverse Number Logic

✓ Comparing Values

✓ Working with Digits

✓ Understanding Number Patterns

Used in:

- String Palindrome
- Linked List Palindrome
- Recursion Problems
- Pattern Recognition Problems