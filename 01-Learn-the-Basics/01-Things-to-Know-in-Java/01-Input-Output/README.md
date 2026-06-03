# 01 Input Output

## Introduction

Input and Output are the basic building blocks of any programming language.

In Java, input is generally taken using the Scanner class, and output is displayed using System.out.print() or System.out.println().

---

## Required Package

```java
import java.util.Scanner;
```

The Scanner class is used to take input from the user.

---

## Basic Program Structure

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}
```

---

## Output in Java

Use println() to print output on a new line.

```java
System.out.println("Hello World");
```

### Output

```text
Hello World
```

---

## Print on Same Line

Use print() instead of println().

```java
System.out.print("Hello ");
System.out.print("World");
```

### Output

```text
Hello World
```

---

## New Line Character

```java
System.out.print("Hello\n");
System.out.print("World");
```

### Output

```text
Hello
World
```

---

## Taking Integer Input

```java
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();

System.out.println(x);
```

### Input

```text
10
```

### Output

```text
10
```

---

## Taking Multiple Inputs

```java
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();

System.out.println(a + " " + b);
```

### Input

```text
10 20
```

### Output

```text
10 20
```

---

## Taking String Input

### Single Word

```java
String name = sc.next();
```

### Full Sentence

```java
String name = sc.nextLine();
```

---

## Common Scanner Methods

| Method           | Description       |
| ---------------- | ----------------- |
| nextInt()        | Reads Integer     |
| nextLong()       | Reads Long        |
| nextFloat()      | Reads Float       |
| nextDouble()     | Reads Double      |
| next()           | Reads Single Word |
| nextLine()       | Reads Full Line   |
| next().charAt(0) | Reads Character   |

---

## Example Program

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
```

---

## Important Points

1. Always import Scanner.
2. Prefer println() for output.
3. Use next() for single words.
4. Use nextLine() for complete sentences.
5. Close Scanner after use.

---

## Interview Questions

### Difference between print() and println()

- print() → prints on same line.
- println() → prints on next line.

### Difference between next() and nextLine()

- next() → reads one word.
- nextLine() → reads complete sentence.

### Why import java.util.Scanner?

Scanner belongs to the java.util package, so it must be imported before use.
