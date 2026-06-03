# 06 For Loops

## Introduction

A loop is used to execute a block of code repeatedly.

The for loop is the most commonly used loop in Java when the number of iterations is known.

It is heavily used in:

- Pattern Problems
- Arrays
- Strings
- Searching
- Sorting
- DSA Problems

---

## Syntax

```java
for(initialization; condition; update){
    // code
}
```

### Example

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

### Output

```text
1
2
3
4
5
```

---

## Components of For Loop

### Initialization

Executed only once.

```java
int i = 1;
```

### Condition

Checked before every iteration.

```java
i <= 5
```

### Update

Executed after every iteration.

```java
i++
```

---

## Printing Numbers from 1 to N

```java
int n = 10;

for(int i = 1; i <= n; i++){
    System.out.print(i + " ");
}
```

### Output

```text
1 2 3 4 5 6 7 8 9 10
```

---

## Printing Numbers from N to 1

```java
for(int i = 10; i >= 1; i--){
    System.out.print(i + " ");
}
```

### Output

```text
10 9 8 7 6 5 4 3 2 1
```

---

## Sum of First N Numbers

```java
int sum = 0;

for(int i = 1; i <= n; i++){
    sum += i;
}
```

---

## Traversing an Array

```java
int[] arr = {10, 20, 30, 40};

for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
}
```

### Output

```text
10 20 30 40
```

---

## Nested For Loops

A loop inside another loop is called a nested loop.

### Example

```java
for(int i = 1; i <= 3; i++){
    for(int j = 1; j <= 3; j++){
        System.out.print("* ");
    }
    System.out.println();
}
```

### Output

```text
* * *
* * *
* * *
```

---

## Pattern Example

```java
for(int i = 1; i <= 5; i++){
    for(int j = 1; j <= i; j++){
        System.out.print("* ");
    }
    System.out.println();
}
```

### Output

```text
*
* *
* * *
* * * *
* * * * *
```

---

## break Statement

Used to terminate the loop immediately.

### Example

```java
for(int i = 1; i <= 10; i++){

    if(i == 5){
        break;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
3
4
```

---

## continue Statement

Used to skip the current iteration.

### Example

```java
for(int i = 1; i <= 5; i++){

    if(i == 3){
        continue;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
4
5
```

---

## Infinite For Loop

```java
for(;;){
    System.out.println("Hello");
}
```

This loop runs forever until stopped.

---

## Important Points

1. Initialization executes only once.
2. Condition is checked before every iteration.
3. Update executes after every iteration.
4. Nested loops are important for patterns.
5. break exits the loop completely.
6. continue skips only the current iteration.

---

## Common Mistakes

### Using Wrong Condition

Wrong ❌

```java
for(int i = 1; i >= 5; i++)
```

The loop will never execute.

Correct ✅

```java
for(int i = 1; i <= 5; i++)
```

---

### Infinite Loop by Mistake

Wrong ❌

```java
for(int i = 1; i <= 5;){
    System.out.println(i);
}
```

Update statement is missing.

---

## Interview Questions

### Difference between break and continue?

- break → exits the loop completely.
- continue → skips current iteration.

### What is a Nested Loop?

A loop inside another loop.

### When should we use a For Loop?

When the number of iterations is known.

### Can a For Loop be Infinite?

Yes.

```java
for(;;)
```

creates an infinite loop.

---

## Striver A2Z Connection

For Loops are used in:

- Pattern Problems
- Arrays
- Strings
- Hashing
- Searching
- Sorting
- Recursion Dry Runs

Master For Loops before moving to advanced DSA topics.
