# Stack in Java

## What is Stack?

Stack is a linear data structure that follows:

**LIFO (Last In First Out)**

The element inserted last is removed first.

Example:

```text
Push: 10, 20, 30

Top
↓
30
20
10

Pop → 30
```

---

## Package

```java
import java.util.Stack;
```

---

## Declaration

```java
Stack<Integer> stack = new Stack<>();
```

---

## Features of Stack

- Follows LIFO Principle
- Dynamic Size
- Allows Duplicates
- Allows Null Values
- Part of Java Collections Framework

---

## Important Methods

### push()

Adds element to top.

```java
stack.push(10);
```

Time Complexity: O(1)

---

### pop()

Removes and returns top element.

```java
stack.pop();
```

Time Complexity: O(1)

---

### peek()

Returns top element without removing.

```java
stack.peek();
```

Time Complexity: O(1)

---

### isEmpty()

Checks whether stack is empty.

```java
stack.isEmpty();
```

---

### search()

Returns position from top.

```java
stack.search(20);
```

---

### size()

Returns number of elements.

```java
stack.size();
```

---

### clear()

Removes all elements.

```java
stack.clear();
```

---

## Stack Operations

### Push

```text
10
20
30
```

Stack:

```text
Top
↓
30
20
10
```

---

### Pop

```text
Pop → 30
```

Remaining:

```text
Top
↓
20
10
```

---

### Peek

```text
Returns 20
```

Stack remains unchanged.

---

## Time Complexities

| Operation | Complexity |
|------------|------------|
| push() | O(1) |
| pop() | O(1) |
| peek() | O(1) |
| search() | O(n) |
| isEmpty() | O(1) |
| size() | O(1) |

---

## Advantages

- Fast Insertions
- Fast Deletions
- Easy Implementation
- Useful in DSA Problems

---

## Disadvantages

- Limited Access
- Cannot Access Middle Element Directly

---

## Real Life Applications

- Undo/Redo Operations
- Browser History
- Function Calls
- Expression Evaluation
- Backtracking
- Recursion

---

## Common Interview Questions

### Which principle does Stack follow?

LIFO (Last In First Out)

---

### Which operation inserts an element?

push()

---

### Which operation removes an element?

pop()

---

### Which operation returns top element?

peek()

---

### Can Stack contain duplicate values?

Yes.

---

### Can Stack contain null values?

Yes.

---

## Revision Notes

- Linear Data Structure
- Follows LIFO
- push() → Insert
- pop() → Remove
- peek() → View Top
- O(1) Push and Pop
- Used in Recursion
- Used in Backtracking
- Used in Expression Evaluation