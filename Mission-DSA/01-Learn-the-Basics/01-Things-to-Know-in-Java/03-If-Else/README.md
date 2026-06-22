# 03 If Else

## Introduction

Decision-making is one of the most important concepts in programming.

Java provides conditional statements that allow a program to execute different blocks of code based on certain conditions.

---

## if Statement

The if statement executes a block of code only when the condition is true.

### Syntax

```java
if(condition){
    // code
}
```

### Example

```java
int age = 18;

if(age >= 18){
    System.out.println("Eligible to Vote");
}
```

### Output

```text
Eligible to Vote
```

---

## if-else Statement

The if-else statement executes one block when the condition is true and another block when the condition is false.

### Syntax

```java
if(condition){
    // code
}
else{
    // code
}
```

### Example

```java
int age = 16;

if(age >= 18){
    System.out.println("Eligible to Vote");
}
else{
    System.out.println("Not Eligible to Vote");
}
```

### Output

```text
Not Eligible to Vote
```

---

## else-if Ladder

Used when multiple conditions need to be checked.

### Syntax

```java
if(condition1){
    // code
}
else if(condition2){
    // code
}
else{
    // code
}
```

### Example

```java
int marks = 85;

if(marks >= 90){
    System.out.println("Grade A");
}
else if(marks >= 75){
    System.out.println("Grade B");
}
else if(marks >= 50){
    System.out.println("Grade C");
}
else{
    System.out.println("Fail");
}
```

### Output

```text
Grade B
```

---

## Nested if

An if statement inside another if statement is called Nested if.

### Example

```java
int age = 20;
boolean hasLicense = true;

if(age >= 18){
    if(hasLicense){
        System.out.println("Can Drive");
    }
}
```

### Output

```text
Can Drive
```

---

## Using Logical Operators

### AND Operator (&&)

Both conditions must be true.

```java
int age = 20;

if(age >= 18 && age <= 25){
    System.out.println("Eligible");
}
```

---

### OR Operator (||)

At least one condition must be true.

```java
int age = 16;

if(age < 18 || age > 60){
    System.out.println("Special Category");
}
```

---

### NOT Operator (!)

Reverses the result.

```java
boolean isLoggedIn = false;

if(!isLoggedIn){
    System.out.println("Please Login");
}
```

---

## Important Points

1. Conditions must return true or false.
2. Curly braces improve readability.
3. else is optional.
4. Only one block of an if-else ladder executes.
5. Nested if statements should be used carefully.

---

## Common Mistakes

### Using = instead of ==

Wrong ❌

```java
if(age = 18)
```

Correct ✅

```java
if(age == 18)
```

---

### Missing Curly Braces

Wrong ❌

```java
if(age >= 18)
    System.out.println("Adult");
    System.out.println("Eligible");
```

Correct ✅

```java
if(age >= 18){
    System.out.println("Adult");
    System.out.println("Eligible");
}
```

---

## Interview Questions

### Difference between if and if-else?

- if executes code only when condition is true.
- if-else executes one block for true and another for false.

### What is an else-if ladder?

A sequence of conditions checked one after another until a match is found.

### What is Nested if?

An if statement inside another if statement.

### Which logical operators are commonly used?

- &&
- ||
- !
