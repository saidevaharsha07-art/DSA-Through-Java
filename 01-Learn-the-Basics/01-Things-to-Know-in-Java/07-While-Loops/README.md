# 🔄 Java While Loop - Super Notes

## What is a While Loop?

A while loop repeatedly executes a block of code as long as a condition remains true.

Used when:

```text
Number of iterations is NOT known beforehand
```

Examples:

```text
Taking user input until valid input is entered
Finding factorial
Processing data until condition becomes false
```

---

# Syntax

```java
while(condition){

    // code

}
```

---

# How While Loop Works?

```text
Condition Check
      ↓
   True ?
   /    \
 Yes    No
  ↓      ↓
 Code   Stop
  ↓
Condition Check Again
```

---

# Basic Example

```java
int i = 1;

while(i <= 5){

    System.out.println(i);

    i++;
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

# Print 1 to 10

```java
int i = 1;

while(i <= 10){

    System.out.println(i);

    i++;
}
```

---

# Print 10 to 1

```java
int i = 10;

while(i >= 1){

    System.out.println(i);

    i--;
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
int i = 2;

while(i <= 10){

    System.out.println(i);

    i += 2;
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
int i = 1;

while(i <= 10){

    System.out.println(i);

    i += 2;
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
int n = 5;
int sum = 0;
int i = 1;

while(i <= n){

    sum += i;

    i++;
}

System.out.println(sum);
```

Output:

```text
15
```

---

# Factorial Using While Loop

Factorial:

```text
5! = 5 × 4 × 3 × 2 × 1
```

Program:

```java
int n = 5;
int factorial = 1;

while(n > 0){

    factorial *= n;

    n--;
}

System.out.println(factorial);
```

Output:

```text
120
```

---

# Reverse a Number

```java
int n = 1234;

while(n > 0){

    int digit = n % 10;

    System.out.print(digit);

    n /= 10;
}
```

Output:

```text
4321
```

---

# Count Digits

```java
int n = 12345;
int count = 0;

while(n > 0){

    count++;

    n /= 10;
}

System.out.println(count);
```

Output:

```text
5
```

---

# Infinite While Loop

```java
while(true){

    System.out.println("Hello");

}
```

⚠ Runs forever.

---

# Break Statement

Stops loop immediately.

```java
int i = 1;

while(i <= 10){

    if(i == 5){
        break;
    }

    System.out.println(i);

    i++;
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
int i = 0;

while(i < 5){

    i++;

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

# While vs For Loop

| For Loop | While Loop |
|-----------|-----------|
| Iterations Known | Iterations Unknown |
| Compact Syntax | More Flexible |
| Initialization Inside | Initialization Outside |

Example:

### For Loop

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

### While Loop

```java
int i = 1;

while(i <= 5){
    System.out.println(i);
    i++;
}
```

---

# Common Mistakes

## Missing Increment

```java
int i = 1;

while(i <= 5){

    System.out.println(i);

}
```

⚠ Infinite Loop

---

## Wrong Condition

```java
int i = 10;

while(i < 1){

    System.out.println(i);

}
```

Loop never executes.

---

# Time Complexity

Single While Loop:

```java
while(condition){

}
```

Complexity:

```text
O(n)
```

Nested While Loop:

```java
while(...){

    while(...){

    }

}
```

Complexity:

```text
O(n²)
```

---

# Viva Questions

### What is a While Loop?

A loop that executes while a condition remains true.

---

### When is While Loop Preferred?

When number of iterations is unknown.

---

### What happens if condition is false initially?

```text
Loop will not execute even once.
```

---

### What is Infinite Loop?

A loop that never terminates.

---

### What is Break?

Stops loop immediately.

---

### What is Continue?

Skips current iteration.

---

# 🚀 Last Minute Revision

```text
while(condition)

Condition Checked First

True  → Execute
False → Stop

Used When:
Iterations Unknown

Factorial:
while(n > 0)

break → Stop Loop

continue → Skip Iteration

Infinite Loop:
while(true)

Complexity:

Single Loop → O(n)

Nested Loop → O(n²)
```