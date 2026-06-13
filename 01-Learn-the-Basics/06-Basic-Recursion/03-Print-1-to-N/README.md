# 03 - Print 1 to N Using Recursion

## Problem Statement

Print numbers from 1 to N using Recursion.

### Example

Input:

```text
N = 5
```

Output:

```text
1
2
3
4
5
```

---

## Understanding the Problem

We need to print numbers starting from 1 and ending at N.

Instead of using a loop, we will use recursion.

Every recursive call will print the current number and move to the next number.

---

## Recursive Thinking

To print numbers from 1 to 5:

```text
Print 1
Ask recursion to print 2 to 5

Print 2
Ask recursion to print 3 to 5

Print 3
Ask recursion to print 4 to 5

Print 4
Ask recursion to print 5 to 5

Print 5
Ask recursion to stop
```

---

## Algorithm

1. Create a recursive function.
2. Check if current number is greater than N.
3. If yes, stop recursion.
4. Print current number.
5. Call recursion with current number + 1.

---

## Code

```java
import java.util.Scanner;

public class Main {

    static void printNumbers(int i, int n) {

        if (i > n) {
            return;
        }

        System.out.println(i);

        printNumbers(i + 1, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        printNumbers(1, n);
    }
}
```

---

## Dry Run

Input:

```text
N = 3
```

Execution:

```text
printNumbers(1,3)

1 <= 3
Print 1

printNumbers(2,3)

2 <= 3
Print 2

printNumbers(3,3)

3 <= 3
Print 3

printNumbers(4,3)

4 > 3
Return
```

Output:

```text
1
2
3
```

---

## Call Stack Visualization

```text
printNumbers(1,3)
|
v
printNumbers(2,3)
|
v
printNumbers(3,3)
|
v
printNumbers(4,3)

Base Case Reached
```

Returning:

```text
printNumbers(4,3) returns

printNumbers(3,3) returns

printNumbers(2,3) returns

printNumbers(1,3) returns
```

---

## Recursion Tree

For N = 4

```text
print(1)

|
v

print(2)

|
v

print(3)

|
v

print(4)

|
v

print(5)

Base Case
```

---

## Base Case

```java
if(i > n){
    return;
}
```

Purpose:

Stops recursion after printing N.

Without this condition:

```text
Infinite Recursion
```

will occur.

---

## Why Print Before Recursive Call?

```java
System.out.println(i);

printNumbers(i + 1, n);
```

Printing happens before recursion.

Therefore output comes in:

```text
1 2 3 4 5
```

This is called:

```text
Head Recursion
```

because work is performed before the recursive call.

---

## What if We Print After Recursive Call?

```java
printNumbers(i + 1, n);

System.out.println(i);
```

Output:

```text
5
4
3
2
1
```

This becomes:

```text
Tail Unwinding Output
```

and is used to print N to 1.

---

## Time Complexity

One function call for each number.

```text
O(N)
```

---

## Space Complexity

N recursive calls are stored in the call stack.

```text
O(N)
```

---

## Iterative Approach

```java
for(int i = 1; i <= n; i++){
    System.out.println(i);
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

## Common Mistakes

### 1. Wrong Base Condition

```java
if(i == n)
```

May skip printing the last value.

Always verify through dry run.

---

### 2. Not Increasing i

```java
printNumbers(i, n);
```

This causes Infinite Recursion.

Correct:

```java
printNumbers(i + 1, n);
```

---

### 3. Printing After Recursive Call

```java
printNumbers(i + 1, n);

System.out.println(i);
```

Output becomes:

```text
N to 1
```

instead of:

```text
1 to N
```

---

## Interview Questions

### Q1. Why is the base case i > n?

Because printing should stop after reaching N.

---

### Q2. Why does output come in ascending order?

Because printing happens before the recursive call.

---

### Q3. What happens if print statement is moved below recursion?

Output becomes:

```text
N to 1
```

---

### Q4. What is Head Recursion?

When work is performed before the recursive call.

Example:

```java
System.out.println(i);

fun(i + 1);
```

---

### Q5. What is Tail Recursion?

When work is performed after the recursive call.

Example:

```java
fun(i + 1);

System.out.println(i);
```

---

### Q6. Time Complexity?

```text
O(N)
```

---

### Q7. Space Complexity?

```text
O(N)
```

because N recursive calls are stored in stack memory.

---

## Key Learning

This problem introduces:

- Head Recursion
- Base Case
- Recursive Progression
- Call Stack
- Stack Unwinding

Understanding this problem makes the next problem (Print N to 1) much easier.

---

## Quick Revision Notes

```text
Goal:
Print 1 to N

Base Case:
i > n

Recursive Call:
printNumbers(i + 1, n)

Print Position:
Before Recursive Call

Type:
Head Recursion

Time Complexity:
O(N)

Space Complexity:
O(N)

Important Concepts:
✔ Base Case
✔ Head Recursion
✔ Call Stack
✔ Stack Unwinding

Common Errors:
❌ Wrong Base Case
❌ Not Incrementing i
❌ Printing After Recursive Call
```