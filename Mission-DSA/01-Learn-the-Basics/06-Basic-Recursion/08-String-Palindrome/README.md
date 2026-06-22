# 08 - String Palindrome Using Recursion

## Problem Statement

Check whether a given string is a Palindrome using Recursion.

### Example 1

Input:

```text
MADAM
```

Output:

```text
Palindrome
```

---

### Example 2

Input:

```text
HELLO
```

Output:

```text
Not Palindrome
```

---

## What is a Palindrome?

A Palindrome is a string that reads the same from both directions.

Examples:

```text
MADAM
LEVEL
RADAR
MALAYALAM
NOON
```

Not Palindromes:

```text
HELLO
JAVA
STRIVER
```

---

## Understanding the Problem

We need to compare:

```text
First Character
Last Character
```

If both are equal:

```text
Move inward
```

and compare the next pair.

Continue until:

```text
All characters match
```

or

```text
A mismatch is found
```

---

## Recursive Thinking

String:

```text
MADAM
```

Compare:

```text
M == M
```

Move inward.

Compare:

```text
A == A
```

Move inward.

Compare:

```text
D == D
```

Middle reached.

Therefore:

```text
Palindrome
```

---

## Recursive Formula

```text
Check current pair

↓

Check remaining substring

↓

palindrome(i + 1)
```

---

## Two Pointer Approach

```text
Left Pointer  → Start

Right Pointer → End
```

Example:

```text
MADAM

M A D A M
↑       ↑
```

Compare both pointers.

Move inward:

```text
M A D A M
  ↑   ↑
```

Continue.

---

## Striver Approach

Instead of passing two pointers:

```text
left
right
```

Striver uses only:

```text
index i
```

Right side is calculated as:

```java
n - i - 1
```

---

## Code (Striver Version)

```java
import java.util.Scanner;

public class Main {

    static boolean palindrome(String s, int i) {

        if (i >= s.length() / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return palindrome(s, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = sc.next();

        if (palindrome(s, 0)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
```

---

## Dry Run

Input:

```text
MADAM
```

Length:

```text
5
```

---

### Step 1

```text
i = 0

M == M
```

Recursive Call:

```text
palindrome(1)
```

---

### Step 2

```text
i = 1

A == A
```

Recursive Call:

```text
palindrome(2)
```

---

### Step 3

```text
i = 2

i >= length/2

2 >= 2

true
```

Return:

```text
true
```

Final Output:

```text
Palindrome
```

---

## Dry Run (Not Palindrome)

Input:

```text
HELLO
```

Step 1

```text
H != O
```

Immediately:

```text
return false
```

Output:

```text
Not Palindrome
```

---

## Call Stack Visualization

Input:

```text
MADAM
```

```text
palindrome(0)

↓

palindrome(1)

↓

palindrome(2)

Base Case
```

Returning:

```text
true

↓

true

↓

true
```

Final Result:

```text
true
```

---

## Recursion Tree

```text
palindrome(0)

|

palindrome(1)

|

palindrome(2)

Base Case
```

---

## Base Case

```java
if(i >= s.length()/2){
    return true;
}
```

Purpose:

When middle is reached:

```text
All comparisons are completed
```

Therefore:

```text
Palindrome
```

---

## Why Return True?

Because:

```text
No mismatch found
```

throughout the entire string.

---

## Mismatch Condition

```java
if(s.charAt(i) != s.charAt(s.length()-i-1)){
    return false;
}
```

Purpose:

Stop immediately when a mismatch occurs.

This avoids unnecessary recursive calls.

---

## Why Use Short-Circuit Return?

Suppose:

```text
HELLO
```

First comparison:

```text
H != O
```

No need to check remaining characters.

Directly:

```text
return false
```

---

## Time Complexity

Half the string is checked.

```text
O(N)
```

---

## Space Complexity

Recursive calls stored in stack.

```text
O(N)
```

More accurately:

```text
O(N/2)
```

which simplifies to:

```text
O(N)
```

---

## Iterative Approach

```java
int left = 0;
int right = s.length() - 1;

while(left < right){

    if(s.charAt(left) != s.charAt(right)){
        return false;
    }

    left++;
    right--;
}
```

Return:

```text
true
```

---

## Recursive vs Iterative

| Recursion | Iteration |
|------------|------------|
| Cleaner | Faster |
| Easy to Learn | Better Performance |
| Uses Stack Memory | O(1) Space |
| Good for Interviews | Good for Production |

---

## Common Mistakes

### 1. Wrong Right Index

Wrong:

```java
s.length() - i
```

Correct:

```java
s.length() - i - 1
```

---

### 2. Wrong Base Case

Wrong:

```java
if(i == s.length())
```

Correct:

```java
if(i >= s.length()/2)
```

---

### 3. Forgetting Return

Wrong:

```java
palindrome(s, i + 1);
```

Correct:

```java
return palindrome(s, i + 1);
```

---

### 4. Comparing Wrong Characters

Always compare:

```java
s.charAt(i)

and

s.charAt(n-i-1)
```

---

## Interview Questions

### Q1. What is a Palindrome?

A string that reads the same forward and backward.

---

### Q2. Why stop at middle?

Because all character pairs have already been checked.

---

### Q3. Why use `n-i-1`?

To access the mirrored character from the end.

---

### Q4. Time Complexity?

```text
O(N)
```

---

### Q5. Space Complexity?

```text
O(N)
```

---

### Q6. Can it be solved iteratively?

Yes.

Using Two Pointers.

---

### Q7. Which approach is preferred?

Production:

```text
Iterative
```

Interview Learning:

```text
Recursive
```

---

## Real Interview Insight

This is one of the most frequently asked recursion questions.

Interviewers use it to test:

- Recursion
- Strings
- Two Pointers
- Base Case Design
- Return Values

Understanding this problem makes string recursion questions much easier.

---

## Key Learning

This problem combines:

```text
Recursion

+

Strings

+

Two Pointers

+

Boolean Return Values
```

These concepts appear repeatedly in coding interviews.

---

## Quick Revision Notes

```text
Goal:
Check Palindrome String

Method:
Recursion + Two Pointers

Base Case:
i >= n/2

Mismatch:
s.charAt(i) != s.charAt(n-i-1)

Recursive Call:
palindrome(i + 1)

Time Complexity:
O(N)

Space Complexity:
O(N)

Important Concepts:
✔ Strings
✔ Recursion
✔ Two Pointers
✔ Boolean Returns

Common Errors:
❌ Wrong Right Index
❌ Wrong Base Case
❌ Forgetting Return
```