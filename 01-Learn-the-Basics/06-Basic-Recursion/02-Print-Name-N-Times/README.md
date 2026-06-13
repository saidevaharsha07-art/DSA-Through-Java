# 02 - Print Name N Times Using Recursion

## Problem Statement

Print your name N times using Recursion.

### Example

Input:

```text
N = 5
```

Output:

```text
Harsha
Harsha
Harsha
Harsha
Harsha
```

---

## Approach

We need a function that prints the name once and then calls itself to print the remaining times.

Every recursive call decreases the count by 1.

When the count reaches N, recursion stops.

---

## Recursive Thinking

To print the name 5 times:

```text
Print once
Ask recursion to print remaining 4 times
```

To print remaining 4 times:

```text
Print once
Ask recursion to print remaining 3 times
```

And so on...

Until the base case is reached.

---

## Algorithm

1. Create a recursive function.
2. Check if count > N.
3. If yes, return.
4. Print the name.
5. Call the function again with count + 1.

---

## Code

```java
import java.util.Scanner;

public class Main {

    static void printName(int count, int n) {

        if (count > n) {
            return;
        }

        System.out.println("Harsha");

        printName(count + 1, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        printName(1, n);
    }
}
```

---

## Dry Run

Input:

```text
n = 3
```

Function Calls:

```text
printName(1,3)

1 <= 3
Print Name

printName(2,3)

2 <= 3
Print Name

printName(3,3)

3 <= 3
Print Name

printName(4,3)

4 > 3
Return
```

Output:

```text
Harsha
Harsha
Harsha
```

---

## Call Stack Visualization

```text
printName(4,3)
printName(3,3)
printName(2,3)
printName(1,3)
```

After reaching base case:

```text
printName(4,3) returns

printName(3,3) returns

printName(2,3) returns

printName(1,3) returns
```

This process is called:

```text
Stack Unwinding
```

---

## Recursion Tree

For n = 3

```text
printName(1)

|
v

printName(2)

|
v

printName(3)

|
v

printName(4)

Base Case
```

---

## Base Case

```java
if(count > n){
    return;
}
```

Purpose:

Stops recursion after printing N times.

Without this condition:

```text
Infinite Recursion
```

will occur.

---

## Why count > n ?

Suppose:

```text
n = 3
```

Valid prints:

```text
1
2
3
```

When:

```text
count = 4
```

Printing should stop.

Therefore:

```java
count > n
```

is the correct base condition.

---

## Time Complexity

The function runs N times.

```text
O(N)
```

---

## Space Complexity

N recursive calls are stored in stack.

```text
O(N)
```

---

## Iterative Approach

Using Loop:

```java
for(int i = 1; i <= n; i++){
    System.out.println("Harsha");
}
```

---

## Recursive vs Iterative

| Recursion | Iteration |
|------------|------------|
| Uses Call Stack | Uses Loop |
| O(N) Space | O(1) Space |
| Easy to Understand | More Efficient |
| Good for Learning Recursion | Better for Simple Repetition |

---

## Common Mistakes

### 1. Forgetting Base Case

```java
printName(count + 1, n);
```

without:

```java
if(count > n)
```

causes Stack Overflow.

---

### 2. Wrong Condition

```java
if(count == n)
```

May print one less time depending on logic.

Always dry run.

---

### 3. Not Increasing count

```java
printName(count, n);
```

This causes Infinite Recursion.

Correct:

```java
printName(count + 1, n);
```

---

## Interview Questions

### Q1. Why do we need count?

To track how many times the name has been printed.

---

### Q2. Why is count increasing?

Because recursion must move toward the base case.

---

### Q3. What happens if count is not updated?

Infinite Recursion occurs.

---

### Q4. What is the Time Complexity?

```text
O(N)
```

---

### Q5. What is the Space Complexity?

```text
O(N)
```

because N recursive calls are stored in stack memory.

---

## Key Learning

This problem teaches:

- Base Case
- Recursive Calls
- Call Stack
- Stack Unwinding
- Dry Running Recursion

This is usually the first recursion problem because it helps understand how recursive functions execute internally.

---

## Quick Revision Notes

```text
Goal:
Print Name N Times

Base Case:
count > n

Recursive Call:
printName(count + 1, n)

Time Complexity:
O(N)

Space Complexity:
O(N)

Important Concepts:
✔ Base Case
✔ Recursive Call
✔ Call Stack
✔ Stack Unwinding

Common Error:
❌ Forgetting Base Case
❌ Not Updating count
❌ Infinite Recursion
```