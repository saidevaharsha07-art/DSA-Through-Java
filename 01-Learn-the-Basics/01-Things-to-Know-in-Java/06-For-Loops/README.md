# 🔁 Java For Loop - Super Notes

## What is a For Loop?

A for loop is used to execute a block of code repeatedly.

It is useful when:

```text
Number of iterations is known
```

Example:

```text
Print numbers 1 to 10
Print a pattern
Traverse an array
```

---

# Why Use a For Loop?

Without Loop:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

Using Loop:

```java
for(int i = 1; i <= 5; i++){
    System.out.println("Hello");
}
```

Cleaner and shorter.

---

# Syntax

```java
for(initialization; condition; increment/decrement){

    // code

}
```

---

# Components of For Loop

## 1. Initialization

Runs only once.

```java
int i = 1;
```

---

## 2. Condition

Checked before every iteration.

```java
i <= 10
```

If condition becomes false, loop stops.

---

## 3. Increment / Decrement

Runs after every iteration.

```java
i++
```

or

```java
i--
```

---

# Basic Example

```java
public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            System.out.println(i);

        }
    }
}
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

# Flow of Execution

```text
Initialization
      ↓
 Condition
      ↓
   True ?
   /    \
 Yes    No
  ↓      ↓
 Code   Stop
  ↓
Increment
  ↓
Condition
```

---

# Print 1 to 10

```java
for(int i = 1; i <= 10; i++){
    System.out.println(i);
}
```

---

# Print 10 to 1

```java
for(int i = 10; i >= 1; i--){
    System.out.println(i);
}
```

Output:

```text
10
9
8
7
6
5
4
3
2
1
```

---

# Print Even Numbers

```java
for(int i = 1; i <= 10; i++){

    if(i % 2 == 0){
        System.out.println(i);
    }

}
```

Output:

```text
2
4
6
8
10
```

---

# Print Odd Numbers

```java
for(int i = 1; i <= 10; i++){

    if(i % 2 != 0){
        System.out.println(i);
    }

}
```

Output:

```text
1
3
5
7
9
```

---

# Sum of First N Numbers

```java
int sum = 0;

for(int i = 1; i <= 5; i++){

    sum += i;

}

System.out.println(sum);
```

Output:

```text
15
```

---

# Multiplication Table

```java
int n = 5;

for(int i = 1; i <= 10; i++){

    System.out.println(n + " x " + i + " = " + (n * i));

}
```

---

# Nested For Loop

A loop inside another loop.

Syntax:

```java
for(...){

    for(...){

    }

}
```

---

# Example

```java
for(int i = 1; i <= 3; i++){

    for(int j = 1; j <= 3; j++){

        System.out.println("i = " + i + ", j = " + j);

    }

}
```

Output:

```text
i = 1, j = 1
i = 1, j = 2
i = 1, j = 3
i = 2, j = 1
...
```

---

# Pattern Example

```java
for(int i = 1; i <= 3; i++){

    for(int j = 1; j <= 3; j++){

        System.out.print("* ");

    }

    System.out.println();

}
```

Output:

```text
* * *
* * *
* * *
```

---

# Custom Increment

Increment by 2

```java
for(int i = 1; i <= 10; i += 2){

    System.out.println(i);

}
```

Output:

```text
1
3
5
7
9
```

---

# Increment by 5

```java
for(int i = 1; i <= 25; i += 5){

    System.out.println(i);

}
```

Output:

```text
1
6
11
16
21
```

---

# Infinite Loop

```java
for(;;){

    System.out.println("Hello");

}
```

Runs forever.

⚠ Avoid unless intentionally required.

---

# Break Statement

Used to stop loop immediately.

```java
for(int i = 1; i <= 10; i++){

    if(i == 5){
        break;
    }

    System.out.println(i);

}
```

Output:

```text
1
2
3
4
```

---

# Continue Statement

Skips current iteration.

```java
for(int i = 1; i <= 5; i++){

    if(i == 3){
        continue;
    }

    System.out.println(i);

}
```

Output:

```text
1
2
4
5
```

---

# Common Mistakes

## Missing Increment

```java
for(int i = 1; i <= 5; ){

}
```

May create infinite loop.

---

## Wrong Condition

```java
for(int i = 1; i >= 5; i++)
```

Loop never executes.

---

# Time Complexity

```java
for(int i = 1; i <= n; i++)
```

Time Complexity:

```text
O(n)
```

Nested Loop:

```java
for(...)
{
    for(...)
    {

    }
}
```

Time Complexity:

```text
O(n²)
```

---

# Viva Questions

### What is a For Loop?

A loop used when the number of iterations is known.

---

### Components of For Loop?

```text
Initialization
Condition
Increment/Decrement
```

---

### What is Nested Loop?

A loop inside another loop.

---

### What is Break?

Stops loop immediately.

---

### What is Continue?

Skips current iteration.

---

### What is Infinite Loop?

A loop that never terminates.

---

# 🚀 Last Minute Revision

```text
for(initialization; condition; increment)

Initialization → Once

Condition → Every Iteration

Increment → After Every Iteration

Nested Loop → Loop inside Loop

break → Stop Loop

continue → Skip Iteration

Infinite Loop:

for(;;)

Complexity:

Single Loop → O(n)

Nested Loop → O(n²)
```