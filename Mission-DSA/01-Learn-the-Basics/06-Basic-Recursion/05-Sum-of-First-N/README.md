# 05 - Sum of First N Numbers Using Recursion

## Problem Statement

Find the sum of the first N natural numbers using Recursion.

### Example

Input:

```text
N = 5
```

Output:

```text
15
```

Explanation:

```text
1 + 2 + 3 + 4 + 5 = 15
```

---

## Understanding the Problem

We need to find:

```text
Sum(5)

=
5 + 4 + 3 + 2 + 1

=
15
```

Instead of using loops, we will use recursion.

The idea is:

```text
Sum(5)

=
5 + Sum(4)

=
5 + 4 + Sum(3)

=
5 + 4 + 3 + Sum(2)

=
5 + 4 + 3 + 2 + Sum(1)

=
5 + 4 + 3 + 2 + 1
```

---

## Recursive Thinking

To calculate Sum(5):

```text
5 + Sum(4)
```

To calculate Sum(4):

```text
4 + Sum(3)
```

To calculate Sum(3):

```text
3 + Sum(2)
```

Eventually:

```text
1 + Sum(0)
```

Base Case:

```text
Sum(0) = 0
```

---

## Recursive Formula

```text
Sum(N) = N + Sum(N - 1)
```

Base Case:

```text
Sum(0) = 0
```

This formula is extremely important for interviews.

---

## Algorithm

1. If N becomes 0, return 0.
2. Otherwise return:
   
```text
N + Sum(N - 1)
```

3. Continue until the base case is reached.

---

## Code

```java
import java.util.Scanner;

public class Main {

    static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));
    }
}
```

---

## Dry Run

Input:

```text
N = 3
```

Function Calls:

```text
sum(3)

=
3 + sum(2)

=
3 + 2 + sum(1)

=
3 + 2 + 1 + sum(0)

=
3 + 2 + 1 + 0

=
6
```

Output:

```text
6
```

---

## Call Stack Visualization

Before Base Case:

```text
Top

sum(0)
sum(1)
sum(2)
sum(3)

Bottom
```

After Base Case:

```text
sum(0) returns 0

sum(1) returns 1

sum(2) returns 3

sum(3) returns 6
```

---

## Stack Unwinding

During return phase:

```text
sum(0)

returns 0
```

```text
sum(1)

returns

1 + 0

=
1
```

```text
sum(2)

returns

2 + 1

=
3
```

```text
sum(3)

returns

3 + 3

=
6
```

This process is called:

```text
Stack Unwinding
```

---

## Recursion Tree

For N = 4

```text
sum(4)

|

4 + sum(3)

|

3 + sum(2)

|

2 + sum(1)

|

1 + sum(0)

|

0
```

Returning:

```text
1

3

6

10
```

Final Answer:

```text
10
```

---

## Base Case

```java
if(n == 0){
    return 0;
}
```

Purpose:

Stops recursion.

Without this condition:

```text
Infinite Recursion
```

will occur.

---

## Why Return is Used?

Unlike printing problems:

```java
return n + sum(n - 1);
```

returns values back to previous function calls.

Each function waits for the smaller problem to be solved.

---

## Time Complexity

One recursive call per number.

```text
O(N)
```

---

## Space Complexity

N recursive calls stored in stack memory.

```text
O(N)
```

---

## Better Mathematical Formula

We know:

```text
1 + 2 + 3 + ... + N
```

Formula:

```text
N × (N + 1) / 2
```

Example:

```text
5 × 6 / 2

=
15
```

Time Complexity:

```text
O(1)
```

Space Complexity:

```text
O(1)
```

---

## Recursive vs Formula Approach

| Recursion | Formula |
|------------|------------|
| O(N) Time | O(1) Time |
| O(N) Space | O(1) Space |
| Teaches Recursion | Best Performance |
| Interview Learning | Practical Solution |

---

## Common Mistakes

### 1. Forgetting Base Case

```java
return n + sum(n - 1);
```

without:

```java
if(n == 0)
```

causes Stack Overflow.

---

### 2. Wrong Base Case

```java
if(n == 1)
    return 0;
```

Incorrect result.

Correct:

```java
if(n == 0)
    return 0;
```

---

### 3. Missing Return Statement

Wrong:

```java
sum(n - 1);
```

Correct:

```java
return n + sum(n - 1);
```

---

## Interview Questions

### Q1. What is the Recursive Formula?

```text
Sum(N) = N + Sum(N - 1)
```

---

### Q2. What is the Base Case?

```text
Sum(0) = 0
```

---

### Q3. Why do we need return?

To pass calculated values back through the call stack.

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

### Q6. Can this be optimized?

Yes.

Using:

```text
N × (N + 1) / 2
```

---

### Q7. Which approach is better?

For interviews:

```text
Recursion
```

For production:

```text
Formula
```

---

## Real Interview Insight

Printing recursion problems teach:

```text
Function Calls
```

This problem teaches:

```text
Returning Values
```

This is the foundation for:

- Factorial
- Fibonacci
- Tree Problems
- Dynamic Programming

---

## Key Learning

This is the first recursion problem where:

```text
Functions Return Values
```

instead of only printing.

Understanding this concept is essential before learning:

```text
Factorial
Fibonacci
Dynamic Programming
```

---

## Quick Revision Notes

```text
Goal:
Sum of First N Numbers

Recursive Formula:
Sum(N) = N + Sum(N - 1)

Base Case:
Sum(0) = 0

Return Statement:
return n + sum(n - 1)

Time Complexity:
O(N)

Space Complexity:
O(N)

Optimized Formula:
N × (N + 1) / 2

Important Concepts:
✔ Returning Values
✔ Stack Unwinding
✔ Recursive Formula
✔ Base Case

Common Errors:
❌ Forgetting Return
❌ Wrong Base Case
❌ Infinite Recursion
```