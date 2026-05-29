# ⚙️ Java Functions (Pass by Value & Pass by Reference) - Super Notes

## What is a Function?

A Function is a block of code that performs a specific task.

Benefits:

```text
Code Reusability
Better Readability
Less Repetition
Easy Maintenance
```

---

# Syntax

```java
returnType functionName(parameters){

    // code

    return value;
}
```

Example:

```java
public static void greet(){

    System.out.println("Hello");

}
```

Calling Function:

```java
greet();
```

Output:

```text
Hello
```

---

# Function with Parameters

```java
public static void greet(String name){

    System.out.println("Hello " + name);

}
```

Calling:

```java
greet("Harsha");
```

Output:

```text
Hello Harsha
```

---

# Function with Return Type

```java
public static int add(int a, int b){

    return a + b;

}
```

Calling:

```java
int sum = add(10, 20);

System.out.println(sum);
```

Output:

```text
30
```

---

# Types of Functions

## No Parameters, No Return

```java
public static void display(){

}
```

---

## Parameters, No Return

```java
public static void display(int n){

}
```

---

## No Parameters, Return Value

```java
public static int getNumber(){

    return 10;

}
```

---

## Parameters and Return Value

```java
public static int add(int a, int b){

    return a + b;

}
```

---

# What is Pass by Value?

When a function receives a COPY of a variable.

Changes inside the function DO NOT affect the original variable.

### Real Life Example

```text
Photocopy of Resume

Edit Copy
↓
Original Resume Unchanged
```

---

# Pass by Value in Java

Java primitives are passed by value.

Example:

```java
public class Main {

    static void modify(int a){

        a = a + 10;

    }

    public static void main(String[] args){

        int x = 5;

        modify(x);

        System.out.println(x);

    }
}
```

Output:

```text
5
```

---

# Memory Visualization

Before Function Call:

```text
x = 5
```

During Function Call:

```text
x = 5

Copy Created

a = 5
```

Modification:

```text
a = 15
```

Original:

```text
x = 5
```

Still unchanged.

---

# Why?

Because Java sends:

```text
COPY OF VALUE
```

Not original variable.

---

# What is Pass by Reference?

Function receives the actual memory reference.

Changes inside function affect original data.

### Real Life Example

```text
Actual Debit Card

Money Withdrawn
↓
Original Balance Changes
```

---

# Does Java Support Pass by Reference?

### Answer

```text
NO
```

Java is ALWAYS Pass by Value.

---

# Then Why Do Objects Change?

Because Java passes:

```text
Copy of Object Reference
```

NOT actual object.

This is often called:

```text
Pass Reference By Value
```

---

# Object Example

```java
class Student{

    int marks = 50;

}

public class Main {

    static void modify(Student s){

        s.marks = 100;

    }

    public static void main(String[] args){

        Student obj = new Student();

        modify(obj);

        System.out.println(obj.marks);

    }
}
```

Output:

```text
100
```

---

# Why Did Object Change?

Before Call:

```text
obj
 ↓
Student Object
marks = 50
```

Function Receives:

```text
Copy of Reference
```

Both point to same object.

```text
obj ─┐
     ↓
Student Object

s   ─┘
```

Changing object:

```java
s.marks = 100;
```

affects original object.

---

# Reassigning Object

```java
static void modify(Student s){

    s = new Student();

    s.marks = 100;

}
```

Output:

```text
50
```

Original remains unchanged.

---

# Why?

Because only copied reference changes.

```text
Original Reference
      ↓
 Object A

Copied Reference
      ↓
 Object B
```

---

# Function Example: Find Square

```java
public static int square(int n){

    return n * n;

}
```

Calling:

```java
System.out.println(square(5));
```

Output:

```text
25
```

---

# Function Example: Check Even Odd

```java
public static void check(int n){

    if(n % 2 == 0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }

}
```

---

# Function Example: Largest of Two Numbers

```java
public static int largest(int a, int b){

    if(a > b){
        return a;
    }

    return b;
}
```

---

# Function Overloading

Same function name.

Different parameters.

```java
public static int add(int a, int b){

    return a + b;

}

public static int add(int a, int b, int c){

    return a + b + c;

}
```

---

# Recursion

Function calling itself.

```java
public static void fun(){

    fun();

}
```

⚠ Infinite recursion if no base case.

---

# Pass by Value vs Pass by Reference

| Pass by Value | Pass by Reference |
|---------------|------------------|
| Copy Sent | Original Sent |
| Original Unchanged | Original Changes |
| Safe | Efficient |
| Java Primitives | C++ References |

---

# Important Java Interview Point

```text
Java is ALWAYS Pass by Value.
```

Even Objects.

Java copies:

```text
Reference Value
```

not actual reference variable.

---

# Viva Questions

### What is a Function?

A reusable block of code that performs a task.

---

### Why Functions?

```text
Code Reusability
Readability
Maintenance
```

---

### What is Pass by Value?

Copy of variable is sent.

---

### What is Pass by Reference?

Original variable is sent.

---

### Does Java Support Pass by Reference?

```text
No
```

Java is always pass by value.

---

### Why Do Objects Change?

Because copy of reference points to same object.

---

### What is Function Overloading?

Same function name with different parameters.

---

### What is Recursion?

Function calling itself.

---

# 🚀 Last Minute Revision

```text
Function

Syntax:

returnType functionName(){

}

Types:

No Parameter No Return

Parameter No Return

No Parameter Return

Parameter Return

Pass By Value

Copy Sent

Original Unchanged

Java Primitives

int
double
char
boolean

Pass By Reference

Original Sent

Original Changes

Java:

ALWAYS PASS BY VALUE

Objects:

Copy of Reference Sent

Function Overloading:

Same Name
Different Parameters

Recursion:

Function Calls Itself
```