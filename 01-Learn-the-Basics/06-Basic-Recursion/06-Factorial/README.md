# 06 - Factorial Using Recursion

## Problem Statement

Find the factorial of a given number N using Recursion.

### Example

Input:

```text
N = 5
```

Output:

```text
120
```

Explanation:

```text
5! = 5 × 4 × 3 × 2 × 1

= 120
```

---

## What is Factorial?

Factorial of a number N is the product of all positive integers from 1 to N.

Notation:

```text
N!
```

Examples:

```text
1! = 1

2! = 2 × 1 = 2

3! = 3 × 2 × 1 = 6

4! = 4 × 3 × 2 × 1 = 24

5! = 5 × 4 × 3 × 2 × 1 = 120
```

---

## Important Special Case

```text
0! = 1
```

This is defined mathematically.

Interviewers often ask this.

Remember:

```text
0! = 1
```

---

## Recursive Thinking

To calculate:

```text
5!
```

We can write:

```text
5 × 4!
```

To calculate:

```text
4!
```

We can write:

```text
4 × 3!
```

To calculate:

```text
3!
```

We can write:

```text
3 × 2!
```

To calculate:

```text
2!
```

We can write:

```text
2 × 1!
```

Base Case:

```text
1! = 1
```

---

## Recursive Formula

```text
Factorial(N) = N × Factorial(N - 1)
```

Base Case:

```text
Factorial(0) = 1
```

or

```text
Factorial(1) = 1
```

---

## Algorithm

1. Check if N is 0.
2. If yes, return 1.
3. Otherwise return:

```text
N × Factorial(N - 1)
```

4. Continue until base case is reached.

---

## Code

```java
import java.util.Scanner;

public class Main {

    static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));
    }
}
```

---

## Dry Run

Input:

```text
N = 4
```

Execution:

```text
factorial(4)

=
4 × factorial(3)

=
4 × 3 × factorial(2)

=
4 × 3 × 2 × factorial(1)

=
4 × 3 × 2 × 1 × factorial(0)

=
4 × 3 × 2 × 1 × 1

=
24
```

Output:

```text
24
```

---

## Call Stack Visualization

Before Base Case:

```text
Top

factorial(0)
factorial(1)
factorial(2)
factorial(3)
factorial(4)

Bottom
```

After Base Case:

```text
factorial(0) returns 1

factorial(1) returns 1

factorial(2) returns 2

factorial(3) returns 6

factorial(4) returns 24
```

---

## Stack Unwinding

```text
factorial(0)

returns 1
```

```text
factorial(1)

1 × 1

=
1
```

```text
factorial(2)

2 × 1

=
2
```

```text
factorial(3)

3 × 2

=
6
```

```text
factorial(4)

4 × 6

=
24
```

Final Answer:

```text
24
```

---

## Recursion Tree

For N = 4

```text
factorial(4)

|

4 × factorial(3)

|

3 × factorial(2)

|

2 × factorial(1)

|

1 × factorial(0)

|

1
```

Returning:

```text
1

2

6

24
```

---

## Base Case

```java
if(n == 0){
    return 1;
}
```

Purpose:

Stops recursion.

Without this:

```text
Infinite Recursion
```

will occur.

---

## Why Return 1?

Suppose:

```text
5! = 5 × 4 × 3 × 2 × 1
```

Multiplication identity:

```text
x × 1 = x
```

Therefore:

```text
0! = 1
```

allows factorial calculations to work correctly.

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

## Iterative Approach

```java
int fact = 1;

for(int i = 1; i <= n; i++){
    fact *= i;
}
```

Time Complexity:

```text
O(N)
```

Space Complexity:

```text
O(1)
```

---

## Recursive vs Iterative

| Recursion | Iteration |
|------------|------------|
| Easy to Understand | More Efficient |
| O(N) Space | O(1) Space |
| Good for Learning | Better Performance |
| Uses Call Stack | Uses Loop |

---

## Common Mistakes

### 1. Returning 0

Wrong:

```java
if(n == 0){
    return 0;
}
```

Every answer becomes:

```text
0
```

Correct:

```java
return 1;
```

---

### 2. Forgetting Return

Wrong:

```java
factorial(n - 1);
```

Correct:

```java
return n * factorial(n - 1);
```

---

### 3. Wrong Recursive Formula

Wrong:

```java
return factorial(n - 1);
```

Correct:

```java
return n * factorial(n - 1);
```

---

### 4. Negative Inputs

Factorial is defined only for:

```text
N ≥ 0
```

Always validate inputs in real applications.

---

## Interview Questions

### Q1. What is the recursive formula?

```text
Factorial(N) = N × Factorial(N - 1)
```

---

### Q2. What is the base case?

```text
Factorial(0) = 1
```

---

### Q3. Why is 0! equal to 1?

Because it is mathematically defined and preserves factorial formulas.

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

### Q6. Can factorial be solved iteratively?

Yes.

Using a loop.

---

### Q7. Which approach is better?

For interviews:

```text
Recursion
```

For production:

```text
Iteration
```

because it uses less memory.

---

## Real Interview Insight

Factorial is one of the most commonly asked recursion questions.

Interviewers use it to check:

- Base Case Understanding
- Recursive Formula Building
- Return Values
- Stack Unwinding Knowledge

Mastering Factorial makes Fibonacci and Tree Recursion easier.

---

## Key Learning

This problem teaches:

```text
Returning Values

Multiplicative Recursion

Recursive Formula Design

Stack Unwinding
```

These concepts are heavily used in:

- Fibonacci
- Dynamic Programming
- Tree Problems
- Graph Algorithms

---

## Quick Revision Notes

```text
Goal:
Find Factorial of N

Formula:
Factorial(N) = N × Factorial(N - 1)

Base Case:
Factorial(0) = 1

Important:
0! = 1

Time Complexity:
O(N)

Space Complexity:
O(N)

Concepts:
✔ Recursive Formula
✔ Return Values
✔ Stack Unwinding
✔ Base Case

Common Errors:
❌ Returning 0
❌ Forgetting Return
❌ Wrong Recursive Formula
```