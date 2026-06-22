# 🚀 Recursion Master Revision Notes

## What is Recursion?

Recursion is a programming technique where a function calls itself until a Base Case is reached.

### Structure

```java
void fun(int n){

    if(n == 0){
        return;
    }

    fun(n - 1);
}
```

Must Have:

✔ Base Case

✔ Recursive Call

---

## Important Terminologies

### Base Case

Condition that stops recursion.

```java
if(n == 0)
    return;
```

Without Base Case:

```text
StackOverflowError
```

---

### Recursive Call

Function calling itself.

```java
fun(n - 1);
```

---

### Call Stack

Stores active function calls.

Works on:

```text
LIFO

(Last In First Out)
```

---

### Stack Unwinding

Functions returning one by one after reaching Base Case.

Example:

```text
fun(3)

↓

fun(2)

↓

fun(1)

↓

fun(0)

Base Case

↑

Return

↑

Return

↑

Return
```

---

### Head Recursion

Work before Recursive Call.

```java
System.out.println(n);

fun(n - 1);
```

Output:

```text
N → 1
```

---

### Backtracking

Work after Recursive Call.

```java
fun(n - 1);

System.out.println(n);
```

Output generated during returning phase.

---

## Complexity Cheat Sheet

| Problem Type | Time | Space |
|-------------|------|--------|
| Print Name N Times | O(N) | O(N) |
| Print 1 to N | O(N) | O(N) |
| Print N to 1 | O(N) | O(N) |
| Sum of N Numbers | O(N) | O(N) |
| Factorial | O(N) | O(N) |
| Reverse Array | O(N) | O(N) |
| Palindrome | O(N) | O(N) |
| Fibonacci | O(2ᴺ) | O(N) |

---

# Problems Summary

## 01. Print Name N Times

### Base Case

```java
if(count > n)
    return;
```

### Recursive Call

```java
printName(count + 1, n);
```

### Complexity

```text
Time  : O(N)

Space : O(N)
```

---

## 02. Print 1 to N

### Logic

Print before recursion.

```java
System.out.println(i);

fun(i + 1);
```

### Base Case

```java
if(i > n)
    return;
```

Output:

```text
1 2 3 4 5
```

---

## 03. Print N to 1

### Logic

Print before recursion.

```java
System.out.println(n);

fun(n - 1);
```

Output:

```text
5 4 3 2 1
```

---

## 04. Print 1 to N Using Backtracking

### Logic

```java
fun(i - 1);

System.out.println(i);
```

Output generated during Stack Unwinding.

---

## 05. Sum of First N Numbers

### Formula

```text
Sum(N)

=

N + Sum(N-1)
```

### Code Pattern

```java
return n + sum(n - 1);
```

### Base Case

```java
if(n == 0)
    return 0;
```

---

## 06. Factorial

### Formula

```text
Factorial(N)

=

N × Factorial(N-1)
```

### Code Pattern

```java
return n * factorial(n - 1);
```

### Base Case

```java
if(n == 0)
    return 1;
```

Important:

```text
0! = 1
```

---

## 07. Reverse Array

### Two Pointer Approach

```java
swap(left,right);

reverse(left+1,right-1);
```

### Base Case

```java
left >= right
```

Striver Version:

```java
arr.length - i - 1
```

---

## 08. String Palindrome

### Comparison

```java
s.charAt(i)

==

s.charAt(n-i-1)
```

### Base Case

```java
i >= n/2
```

### Mismatch

```java
return false;
```

---

## 09. Fibonacci

### Formula

```text
F(N)

=

F(N-1) + F(N-2)
```

### Base Cases

```java
if(n <= 1)
    return n;
```

### Complexity

```text
Time : O(2ᴺ)

Space : O(N)
```

---

# Most Asked Interview Questions

### What is Recursion?

Function calling itself.

---

### What is Base Case?

Condition that stops recursion.

---

### What is Stack Overflow?

Infinite recursion causing stack memory exhaustion.

---

### What is Stack Unwinding?

Returning phase of recursive calls.

---

### Difference Between Recursion and Iteration?

| Recursion | Iteration |
|------------|------------|
| Function Calls | Loops |
| Uses Stack | No Stack |
| Easy to Write | Memory Efficient |
| O(N) Space | O(1) Space |

---

### What is Backtracking?

Doing work while returning from recursive calls.

---

### Why is Fibonacci Expensive?

Repeated calculations.

Example:

```text
F(3)

F(2)
```

are computed many times.

---

# Common Mistakes

❌ Forgetting Base Case

❌ Wrong Base Condition

❌ Infinite Recursion

❌ Missing Return Statement

❌ Incorrect Recursive Formula

❌ Wrong Index Calculation

❌ Ignoring Stack Space

---

# Recursion Pattern Recognition

### Pattern 1: Printing

```java
print

↓

recursive call
```

Examples:

- Print Name
- Print 1 to N
- Print N to 1

---

### Pattern 2: Returning Values

```java
return current + recursion(...)
```

Examples:

- Sum of N
- Factorial

---

### Pattern 3: Two Pointer Recursion

```java
left++
right--
```

Examples:

- Reverse Array
- Palindrome

---

### Pattern 4: Branching Recursion

```java
fun(n-1)

+

fun(n-2)
```

Examples:

- Fibonacci

---

# Final Interview Revision

```text
Recursion = Function Calls Itself

Must Have:
✔ Base Case
✔ Recursive Call

Head Recursion:
Work Before Recursion

Backtracking:
Work After Recursion

Call Stack:
LIFO

Stack Unwinding:
Returning Phase

Patterns Learned:
✔ Printing
✔ Returning Values
✔ Two Pointers
✔ Branching Recursion

Most Important Formulas:

Sum(N)
=
N + Sum(N-1)

Factorial(N)
=
N × Factorial(N-1)

Fibonacci(N)
=
F(N-1) + F(N-2)

Golden Rule:

Identify Base Case First.
Then Build Recursive Relation.
```