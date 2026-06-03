# 05 Arrays and Strings

## Introduction

Arrays and Strings are the most important topics in Java and form the foundation for Data Structures and Algorithms.

- Arrays store multiple values of the same data type.
- Strings store sequences of characters.

Most DSA problems are based on Arrays and Strings.

---

## Arrays

An array is a collection of elements stored at contiguous memory locations.

### Syntax

```java
dataType[] arrayName = new dataType[size];
```

### Example

```java
int[] arr = new int[5];
```

---

## Array Initialization

```java
int[] arr = {10, 20, 30, 40, 50};
```

---

## Accessing Elements

Array indexing starts from 0.

### Example

```java
int[] arr = {10, 20, 30};

System.out.println(arr[0]);
System.out.println(arr[2]);
```

### Output

```text
10
30
```

---

## Taking Array Input

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int[] arr = new int[n];

for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt();
}
```

---

## Traversing an Array

```java
for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
}
```

### Output

```text
10 20 30 40 50
```

---

## Enhanced For Loop

### Example

```java
for(int num : arr){
    System.out.print(num + " ");
}
```

---

## Array Length

```java
System.out.println(arr.length);
```

### Output

```text
5
```

---

# Strings

A String is a sequence of characters enclosed within double quotes.

### Example

```java
String name = "Harsha";
```

---

## String Input

### Single Word

```java
String name = sc.next();
```

### Full Sentence

```java
String sentence = sc.nextLine();
```

---

## String Length

```java
String str = "Hello";

System.out.println(str.length());
```

### Output

```text
5
```

---

## charAt()

Returns the character at a specific index.

### Example

```java
String str = "Java";

System.out.println(str.charAt(2));
```

### Output

```text
v
```

---

## substring()

Extracts part of a string.

### Example

```java
String str = "Programming";

System.out.println(str.substring(0, 4));
```

### Output

```text
Prog
```

---

## String Comparison

### equals()

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

### Output

```text
true
```

---

### equalsIgnoreCase()

```java
System.out.println("java".equalsIgnoreCase("JAVA"));
```

### Output

```text
true
```

---

## String Concatenation

```java
String first = "Hello";
String second = "World";

System.out.println(first + " " + second);
```

### Output

```text
Hello World
```

---

## Important Points

1. Array indexing starts from 0.
2. Array size cannot be changed after creation.
3. Strings are immutable in Java.
4. Use length for arrays and length() for strings.
5. Strings are objects in Java.

---

## Common Mistakes

### Using length() on Arrays

Wrong ❌

```java
arr.length()
```

Correct ✅

```java
arr.length
```

---

### Using length on Strings

Wrong ❌

```java
str.length
```

Correct ✅

```java
str.length()
```

---

### Comparing Strings with ==

Wrong ❌

```java
if(a == b)
```

Correct ✅

```java
if(a.equals(b))
```

---

## Interview Questions

### Difference between Array and String?

- Array stores multiple elements of the same type.
- String stores characters.

### Difference between length and length()?

- length → Array property.
- length() → String method.

### What is String Immutability?

Once a String is created, its value cannot be changed.

### Why do Arrays start from Index 0?

Because array indexing is based on memory offset calculations.

---

## Striver A2Z Connection

Arrays and Strings are heavily used in:

- Basic Hashing
- Sorting
- Searching
- Two Pointer Problems
- Sliding Window
- Prefix Sum
- Binary Search
- Recursion
- Dynamic Programming

Master Arrays and Strings before moving deeper into DSA.
