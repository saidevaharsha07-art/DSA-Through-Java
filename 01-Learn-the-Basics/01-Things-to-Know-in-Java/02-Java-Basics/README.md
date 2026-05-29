# ☕ Java Basics - Super Notes

## 1. What is Java?

Java is a:

* High-Level Language
* Object-Oriented Language
* Platform Independent Language

### Principle

```text
Write Once
Run Anywhere (WORA)
```

Java code runs on JVM.

---

## 2. Java Architecture

```text
Java Code (.java)
       ↓
Compiler (javac)
       ↓
Bytecode (.class)
       ↓
JVM
       ↓
Output
```

### Components

| Component | Full Form                |
| --------- | ------------------------ |
| JVM       | Java Virtual Machine     |
| JRE       | Java Runtime Environment |
| JDK       | Java Development Kit     |

---

## 3. First Java Program

```java
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

    }
}
```

### Output

```text
Hello World
```

---

## 4. Comments

### Single Line Comment

```java
// This is a comment
```

### Multi Line Comment

```java
/*
This is
a comment
*/
```

---

## 5. Variables

A variable is a container used to store data.

### Syntax

```java
datatype variableName = value;
```

### Example

```java
int age = 18;
String name = "Harsha";
```

---

## 6. Data Types

### Primitive Data Types

| Data Type | Size    | Example |
| --------- | ------- | ------- |
| byte      | 1 Byte  | 10      |
| short     | 2 Bytes | 100     |
| int       | 4 Bytes | 1000    |
| long      | 8 Bytes | 100000  |
| float     | 4 Bytes | 10.5f   |
| double    | 8 Bytes | 10.55   |
| char      | 2 Bytes | 'A'     |
| boolean   | 1 Bit   | true    |

---

## 7. Integer Types

```java
byte a = 10;
short b = 100;
int c = 1000;
long d = 100000L;
```

---

## 8. Decimal Types

```java
float f = 10.5f;
double d = 10.55;
```

### Note

```text
float  → suffix f required
double → default decimal type
```

---

## 9. Character Type

```java
char grade = 'A';
```

### Output

```text
A
```

---

## 10. Boolean Type

```java
boolean isPassed = true;
```

Possible Values:

```text
true
false
```

---

## 11. Strings

String stores text.

```java
String name = "Harsha";
```

### Output

```text
Harsha
```

---

## 12. Type Casting

### Implicit Casting

Small → Large

```java
int a = 10;
double b = a;
```

Output:

```text
10.0
```

---

### Explicit Casting

Large → Small

```java
double a = 10.5;
int b = (int)a;
```

Output:

```text
10
```

---

## 13. Constants

Use `final`.

```java
final double PI = 3.14;
```

Cannot change later.

```java
PI = 5.0; // Error
```

---

## 14. Operators

### Arithmetic Operators

| Operator | Meaning        |
| -------- | -------------- |
| +        | Addition       |
| -        | Subtraction    |
| *        | Multiplication |
| /        | Division       |
| %        | Modulus        |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a % b);
```

---

## 15. Relational Operators

| Operator | Meaning       |
| -------- | ------------- |
| ==       | Equal         |
| !=       | Not Equal     |
| >        | Greater Than  |
| <        | Less Than     |
| >=       | Greater Equal |
| <=       | Less Equal    |

Example:

```java
System.out.println(10 > 5);
```

Output:

```text
true
```

---

## 16. Logical Operators

| Operator | Meaning |
| -------- | ------- |
| &&       | AND     |
| ||       | OR      |
| !        | NOT     |

Example:

```java
System.out.println(true && false);
```

Output:

```text
false
```

---

## 17. Increment / Decrement

### Increment

```java
a++;
++a;
```

### Decrement

```java
a--;
--a;
```

---

## 18. Escape Sequences

| Escape | Meaning      |
| ------ | ------------ |
| \n     | New Line     |
| \t     | Tab          |
| "      | Double Quote |
| '      | Single Quote |
| \      | Backslash    |

Example:

```java
System.out.println("Hello\nWorld");
```

Output:

```text
Hello
World
```

---

## 19. Naming Rules

### Valid

```java
age
studentName
_marks
```

### Invalid

```java
1age
class
student-name
```

---

## 20. Keywords

Reserved words in Java.

Examples:

```text
int
double
class
public
private
static
void
return
if
else
for
while
```

Cannot be used as variable names.

---

## 21. Java Memory Basics

```text
Stack Memory
↓
Local Variables

Heap Memory
↓
Objects
```

Example:

```java
String name = new String("Harsha");
```

Object stored in Heap.

---

## 22. Complete Example

```java
public class Main {
    public static void main(String[] args) {

        int age = 18;
        double cgpa = 8.5;
        char grade = 'A';
        boolean passed = true;
        String name = "Harsha";

        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(grade);
        System.out.println(passed);
    }
}
```

---

# 🎯 Viva Questions

### What is JVM?

Java Virtual Machine used to run Java bytecode.

---

### Difference between JDK, JRE and JVM?

```text
JDK → Development Kit
JRE → Runtime Environment
JVM → Executes Bytecode
```

---

### Difference between float and double?

```text
float  → 4 bytes
double → 8 bytes
```

---

### What is Type Casting?

Converting one data type into another.

---

### What is a Variable?

A named memory location used to store data.

---

# 🚀 Last Minute Revision

```text
Java = High Level + OOP + Platform Independent

JDK → JRE → JVM

Data Types:
byte
short
int
long
float
double
char
boolean

String → Stores text

Operators:
+ - * / %
== != > < >= <=
&& || !

Casting:
Implicit → Small to Large
Explicit → Large to Small

final → Constant

Comments:
// Single Line
/* Multi Line */

Escape:
\n New Line
\t Tab
```