# 01 - Recursion Basics

## Definition

Recursion is a programming technique where a function calls itself to solve a smaller version of the same problem until a stopping condition (Base Case) is reached.

Instead of solving the entire problem at once, recursion breaks the problem into smaller subproblems.

---

## Real Life Example

Think of standing between two mirrors.

The image keeps repeating again and again.

Similarly, in recursion, a function keeps calling itself until a stopping condition is reached.

Another example:

Opening nested boxes.

Box 1 contains Box 2.  
Box 2 contains Box 3.  
Box 3 contains Box 4.

You keep opening smaller boxes until the smallest box is reached.

---

## Structure of a Recursive Function

```java
void recursion(int n){

    // Base Case
    if(n == 0){
        return;
    }

    // Work
    System.out.println(n);

    // Recursive Call
    recursion(n - 1);
}
```

Every recursive function contains:

1. Base Case
2. Work to Perform
3. Recursive Call

---

## What is a Base Case?

A Base Case is the condition that stops recursion.

Without a base case, the function will keep calling itself forever.

Example:

```java
if(n == 0){
    return;
}
```

---

## What is a Recursive Call?

A recursive call is when a function calls itself.

Example:

```java
recursion(n - 1);
```

The problem size becomes smaller after every call.

---

## Recursive Flow Example

Code:

```java
void printNum(int n){

    if(n == 0){
        return;
    }

    System.out.println(n);

    printNum(n - 1);
}
```

Call:

```java
printNum(3);
```

Execution:

```text
printNum(3)
→ prints 3
→ calls printNum(2)

printNum(2)
→ prints 2
→ calls printNum(1)

printNum(1)
→ prints 1
→ calls printNum(0)

printNum(0)
→ return
```

Output:

```text
3
2
1
```

---

## How Recursion Works Internally

Every recursive call gets stored inside memory called the Call Stack.

Example:

```java
printNum(3);
```

Stack:

```text
Top

printNum(0)
printNum(1)
printNum(2)
printNum(3)

Bottom
```

When the base case is reached:

```text
printNum(0) returns

Then:

printNum(1) returns

Then:

printNum(2) returns

Then:

printNum(3) returns
```

This process is called **Stack Unwinding**.

---

## Call Stack

A Call Stack stores function calls.

Whenever a function is called:

- It is pushed into the stack.

Whenever a function finishes:

- It is removed from the stack.

### LIFO Principle

**Last In First Out**

Same as Stack Data Structure.

---

## Stack Overflow

If recursion never reaches a base case:

```java
void fun(){
    fun();
}
```

The stack keeps growing until memory becomes full.

This causes:

```text
StackOverflowError
```

---

## Recursion Tree

Example:

```java
fun(3);
```

Tree:

```text
3
|
2
|
1
|
0

Base Case
```

This tree helps visualize recursive calls.

---

## Advantages of Recursion

1. Cleaner Code
2. Easier for Tree Problems
3. Easier for Backtracking
4. Easier for Divide and Conquer Algorithms
5. Natural Problem Solving Approach

Examples:

- Tree Traversal
- DFS
- Merge Sort
- Quick Sort
- Backtracking

---

## Disadvantages of Recursion

1. Extra Memory Usage
2. Function Call Overhead
3. Slower than Iteration
4. Risk of Stack Overflow

---

## Recursion vs Iteration

| Recursion | Iteration |
|------------|------------|
| Uses Function Calls | Uses Loops |
| Uses Call Stack | No Extra Stack |
| Easy to Write | Slightly Longer |
| More Memory | Less Memory |
| Good for Trees | Good for Simple Repetition |

---

## Time Complexity

Depends on the number of recursive calls.

Single Recursive Call:

```java
fun(n){
    fun(n - 1);
}
```

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(n)
```

Because `n` function calls are stored in the call stack.

---

## Common Interview Questions

### Q1. What is Recursion?

A function calling itself until a base condition is reached.

---

### Q2. Why is Base Case Important?

Without a base case recursion never stops and causes Stack Overflow.

---

### Q3. What is Stack Overflow?

When recursive calls exceed available stack memory.

---

### Q4. What is Call Stack?

Memory area where active function calls are stored.

---

### Q5. Difference Between Recursion and Iteration?

Recursion uses function calls.

Iteration uses loops.

Recursion consumes extra stack memory.

---

### Q6. Can Every Recursive Problem Be Solved Iteratively?

Yes.

Most recursive problems can be converted into loops or explicit stacks.

---

### Q7. Why is Recursion Used?

Because some problems become easier to solve:

- Trees
- Graphs
- Backtracking
- Divide and Conquer

---

## Common Mistakes

### 1. Forgetting the Base Case

```java
void fun(){
    fun();
}
```

Causes infinite recursion and Stack Overflow.

---

### 2. Incorrect Base Case

```java
if(n == 1)
```

Sometimes the problem requires:

```java
if(n == 0)
```

Always analyze carefully.

---

### 3. Not Reducing the Problem Size

```java
fun(n);
```

Instead of:

```java
fun(n - 1);
```

The problem size must move toward the base case.

---

### 4. Ignoring Stack Memory

Large recursive calls may cause Stack Overflow.

---

## Where Recursion is Used

### Trees

- Inorder Traversal
- Preorder Traversal
- Postorder Traversal

### Graphs

- DFS

### Sorting

- Merge Sort
- Quick Sort

### Backtracking

- N Queens
- Sudoku Solver
- Rat in a Maze

### Dynamic Programming

- Fibonacci
- Climbing Stairs
- Knapsack

---

## Interview Tip

Whenever a recursion question is asked:

1. Identify the Base Case
2. Identify the Smaller Subproblem
3. Write the Recursive Call
4. Dry Run Using the Call Stack
5. Calculate Time and Space Complexity

---

## Quick Revision Notes

```text
Recursion = Function calls itself

Must Have:
✔ Base Case
✔ Recursive Call

Without Base Case:
❌ Infinite Recursion
❌ Stack Overflow

Call Stack:
LIFO Structure

Stack Unwinding:
Functions return one by one after reaching base case

Single Recursive Call:
Time = O(n)
Space = O(n)

Important Terms:
• Base Case
• Recursive Call
• Call Stack
• Stack Unwinding
• Stack Overflow
• Recursion Tree
```