# 02 Java Basics

## Introduction

Java is a high-level, object-oriented programming language developed by Sun Microsystems.

It follows the principle:

```text
Write Once, Run Anywhere (WORA)
```

Java programs run on the Java Virtual Machine (JVM).

---

## Variables

Variables are used to store data.

### Syntax

```java
dataType variableName = value;
```

### Example

```java
int age = 18;
String name = "Harsha";
```

---

## Data Types

Java provides different data types to store different kinds of values.

| Data Type | Size    | Example              |
| --------- | ------- | -------------------- |
| byte      | 1 byte  | byte a = 10;         |
| short     | 2 bytes | short a = 100;       |
| int       | 4 bytes | int a = 1000;        |
| long      | 8 bytes | long a = 100000L;    |
| float     | 4 bytes | float a = 10.5f;     |
| double    | 8 bytes | double a = 10.55;    |
| char      | 2 bytes | char c = 'A';        |
| boolean   | 1 bit   | boolean flag = true; |

---

## Identifiers

Identifiers are names given to variables, methods, classes, etc.

### Valid Examples

```java
age
studentName
totalMarks
```

### Invalid Examples

```java
1age
student-name
class
```

---

## Operators

Operators perform operations on variables and values.

### Arithmetic Operators

```java
+
-
*
/
/%
```

### Example

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a % b);
```

---

## Relational Operators

Used for comparison.

```java
==
!=
>
<
>=
<=
```

### Example

```java
System.out.println(10 > 5);
```

Output:

```text
true
```

---

## Logical Operators

Used to combine conditions.

```java
&&
||
!
```

### Example

```java
int age = 20;

System.out.println(age > 18 && age < 25);
```

---

## Assignment Operators

```java
=
+=
-=
*=
/=
%=
```

### Example

```java
int x = 10;

x += 5;
```

Output:

```text
15
```

---

## Type Casting

Converting one data type into another.

### Implicit Casting

Smaller → Larger

```java
int a = 10;
double b = a;
```

### Explicit Casting

Larger → Smaller

```java
double a = 10.5;
int b = (int)a;
```

Output:

```text
10
```

---

## Constants

Use final keyword to create constants.

```java
final double PI = 3.14159;
```

Value cannot be changed later.

---

## Keywords

Keywords are reserved words in Java.

### Examples

```java
class
public
static
void
int
double
return
if
else
for
while
```

---

## Naming Conventions

### Variables

```java
studentName
totalMarks
```

### Classes

```java
Student
Employee
Main
```

### Constants

```java
MAX_SIZE
PI
```

---

## Important Points

1. Java is case-sensitive.
2. Every statement ends with a semicolon (;).
3. Variable names cannot start with numbers.
4. Keywords cannot be used as identifiers.
5. Use meaningful variable names.

---

## Common Mistakes

### Forgetting Semicolon

```java
int a = 10
```

Wrong ❌

```java
int a = 10;
```

Correct ✅

### Using Reserved Keywords

```java
int class = 10;
```

Wrong ❌

---

## Interview Questions

### Difference between int and long?

- int → 4 bytes
- long → 8 bytes

### Difference between float and double?

- float → less precision
- double → more precision

### What is Type Casting?

Converting one data type into another.

### What is a Constant?

A variable whose value cannot be changed after initialization.
