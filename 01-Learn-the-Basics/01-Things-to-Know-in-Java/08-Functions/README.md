# 08 Functions

## Introduction

A Function (Method in Java) is a block of code designed to perform a specific task.

Functions help in:

- Code Reusability
- Better Readability
- Easier Debugging
- Modular Programming

Instead of writing the same code multiple times, we can create a method and call it whenever needed.

---

## Syntax

```java
returnType methodName(parameters){
    // code
}
```

### Example

```java
public static void greet(){
    System.out.println("Hello Harsha");
}
```

---

## Calling a Function

```java
public class Main {

    public static void greet(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

### Output

```text
Hello
```

---

## Function with Parameters

Parameters allow values to be passed into a function.

### Example

```java
public static void greet(String name){
    System.out.println("Hello " + name);
}

public static void main(String[] args){
    greet("Harsha");
}
```

### Output

```text
Hello Harsha
```

---

## Function with Return Value

A function can return a value using the return keyword.

### Example

```java
public static int add(int a, int b){
    return a + b;
}
```

```java
int sum = add(10, 20);
System.out.println(sum);
```

### Output

```text
30
```

---

## Void Functions

A void function does not return any value.

### Example

```java
public static void display(){
    System.out.println("Java");
}
```

---

## Non-Void Functions

A non-void function returns a value.

### Example

```java
public static int square(int n){
    return n * n;
}
```

---

## Function to Find Maximum

```java
public static int max(int a, int b){

    if(a > b){
        return a;
    }

    return b;
}
```

---

## Function Overloading

Multiple methods with the same name but different parameters.

### Example

```java
public static int add(int a, int b){
    return a + b;
}

public static int add(int a, int b, int c){
    return a + b + c;
}
```

---

## Pass By Value

Java uses Pass By Value.

### Example

```java
public static void change(int x){
    x = 100;
}

public static void main(String[] args){

    int num = 10;

    change(num);

    System.out.println(num);
}
```

### Output

```text
10
```

The original variable remains unchanged.

---

## Recursive Function

A function calling itself is called Recursion.

### Example

```java
public static void printNumbers(int n){

    if(n == 0){
        return;
    }

    System.out.println(n);

    printNumbers(n - 1);
}
```

### Output

```text
5
4
3
2
1
```

---

## Scope of Variables

### Local Variable

Declared inside a method.

```java
public static void test(){
    int x = 10;
}
```

### Global Variable

Declared inside the class but outside methods.

```java
class Main{

    static int x = 10;

}
```

---

## Important Points

1. Methods improve code reusability.
2. Use meaningful method names.
3. Parameters receive input values.
4. Return statements send values back.
5. Java supports method overloading.
6. Java uses Pass By Value.

---

## Common Mistakes

### Missing Return Statement

Wrong ❌

```java
public static int add(int a, int b){
    int sum = a + b;
}
```

Correct ✅

```java
public static int add(int a, int b){
    return a + b;
}
```

---

### Calling Non-Static Method from Main

Wrong ❌

```java
public void display(){}

public static void main(String[] args){
    display();
}
```

---

## Interview Questions

### What is a Function?

A reusable block of code that performs a specific task.

### Difference Between Void and Non-Void Function?

- Void → returns nothing.
- Non-Void → returns a value.

### What is Function Overloading?

Multiple methods with the same name but different parameters.

### What is Recursion?

A function calling itself.

### Does Java Support Pass By Reference?

No.

Java uses Pass By Value.

---

## Striver A2Z Connection

Functions are used in:

- Recursion
- Sorting Algorithms
- Searching Algorithms
- Trees
- Graphs
- Dynamic Programming

Master Functions before learning Recursion.
