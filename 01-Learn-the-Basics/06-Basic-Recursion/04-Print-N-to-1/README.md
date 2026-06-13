# 04 - Print N to 1 Using Recursion

## Problem Statement

Print numbers from N to 1 using Recursion.

### Example

Input:

```text
N = 5
```

Output:

```text
5
4
3
2
1
```

---

## Understanding the Problem

We need to print numbers in decreasing order starting from N and ending at 1.

Instead of using loops, we will use recursion.

The current number is printed first and then recursion is called for the next smaller number.

---

## Recursive Thinking

To print numbers from 5 to 1:

```text
Print 5
Ask recursion to print 4 to 1

Print 4
Ask recursion to print 3 to 1

Print 3
Ask recursion to print 2 to 1

Print 2
Ask recursion to print 1 to 1

Print 1
Ask recursion to stop
```

---

## Algorithm

1. Create a recursive function.
2. Check if current number is less than 1.
3. If yes, stop recursion.
4. Print current number.
5. Call recursion with current number - 1.

---

## Code

```java
import java.util.Scanner;

public class Main {

    static void printNumbers(int n) {

        if (n < 1) {
            return;
        }

        System.out.println(n);

        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        printNumbers(n);
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
printNumbers(3)

3 >= 1
Print 3

printNumbers(2)

2 >= 1
Print 2

printNumbers(1)

1 >= 1
Print 1

printNumbers(0)

0 < 1
Return
```

Output:

```text
3
2
1
```

---

## Call Stack Visualization

```text
printNumbers(3)
|
v
printNumbers(2)
|
v
printNumbers(1)
|
v
printNumbers(0)

Base Case Reached
```

Returning:

```text
printNumbers(0) returns

printNumbers(1) returns

printNumbers(2) returns

printNumbers(3) returns
```

---

## Recursion Tree

For N = 4

```text
print(4)

|
v

print(3)

|
v

print(2)

|
v

print(1)

|
v

print(0)

Base Case
```

---

## Base Case

```java
if(n < 1){
    return;
}
```

Purpose:

Stops recursion after printing 1.

Without this condition:

```text
Infinite Recursion
```

will occur.

---

## Why Print Before Recursive Call?

```java
System.out.println(n);

printNumbers(n - 1);
```

Printing happens before recursion.

Therefore output comes in:

```text
N → N-1 → N-2 → ... → 1
```

This is an example of:

```text
Head Recursion
```

because work is performed before the recursive call.

---

## Alternative Approach

We can also print N to 1 using Backtracking.

Example:

```java
static void printNumbers(int i, int n){

    if(i > n){
        return;
    }

    printNumbers(i + 1, n);

    System.out.println(i);
}
```

Input:

```text
printNumbers(1,5);
```

Output:

```text
5
4
3
2
1
```

This uses stack unwinding to print in reverse order.

---

## Time Complexity

One function call for each number.

```text
O(N)
```

---

## Space Complexity

N recursive calls are stored in stack memory.

```text
O(N)
```

---

## Iterative Approach

```java
for(int i = n; i >= 1; i--){
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

### 1. Wrong Base Case

```java
if(n == 1){
    return;
}
```

This may skip printing 1.

Always dry run the code.

---

### 2. Not Decreasing n

```java
printNumbers(n);
```

This causes Infinite Recursion.

Correct:

```java
printNumbers(n - 1);
```

---

### 3. Printing After Recursive Call

```java
printNumbers(n - 1);

System.out.println(n);
```

Output becomes:

```text
1
2
3
...
N
```

instead of:

```text
N
N-1
...
1
```

---

## Interview Questions

### Q1. Why is the base case n < 1?

Because after printing 1, recursion should stop.

---

### Q2. Why does output come in decreasing order?

Because the number is printed before making the recursive call.

---

### Q3. What happens if we print after recursion?

Output becomes:

```text
1 to N
```

due to stack unwinding.

---

### Q4. Can this problem be solved using Backtracking?

Yes.

Print statement can be placed after recursion.

---

### Q5. What is Head Recursion?

Work is performed before recursive call.

Example:

```java
System.out.println(n);

fun(n - 1);
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

This problem teaches:

- Head Recursion
- Reverse Traversal
- Base Case Design
- Stack Memory Usage
- Difference Between Direct Recursion and Backtracking

---

## Comparison with Previous Problem

### Print 1 to N

```java
System.out.println(i);

fun(i + 1);
```

Output:

```text
1 2 3 4 5
```

---

### Print N to 1

```java
System.out.println(n);

fun(n - 1);
```

Output:

```text
5 4 3 2 1
```

---

## Quick Revision Notes

```text
Goal:
Print N to 1

Base Case:
n < 1

Recursive Call:
printNumbers(n - 1)

Print Position:
Before Recursive Call

Type:
Head Recursion

Alternative:
Backtracking

Time Complexity:
O(N)

Space Complexity:
O(N)

Important Concepts:
✔ Base Case
✔ Head Recursion
✔ Stack Unwinding
✔ Backtracking

Common Errors:
❌ Wrong Base Case
❌ Not Decrementing n
❌ Wrong Print Position
```