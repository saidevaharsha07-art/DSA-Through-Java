# 📦 Java Arrays and Strings - Super Notes

## What is an Array?

An Array is a collection of similar data types stored in contiguous memory locations.

```text
Array = Collection of Homogeneous Elements
```

Example:

```java
int[] arr = {10, 20, 30, 40, 50};
```

### Visualization

```text
Index : 0   1   2   3   4
Value : 10  20  30  40  50
```

---

## Why Arrays are 0 Indexed?

Array indexing starts from 0.

```text
First Element  → arr[0]
Second Element → arr[1]
Last Element   → arr[n-1]
```

Reason:

```text
Memory calculation becomes easier.
```

---

## Characteristics of Arrays

### Homogeneous

All elements must be of the same type.

✅ Valid

```java
int[] arr = {1, 2, 3, 4};
```

❌ Invalid

```java
int[] arr = {1, "Hello", 3};
```

---

### Fixed Size

Size cannot be changed after creation.

```java
int[] arr = new int[5];
```

Array size = 5 forever.

---

### Contiguous Memory

Elements are stored one after another in memory.

```text
[10][20][30][40][50]
```

This allows fast access.

---

## Array Declaration

### Method 1

```java
int[] arr;
```

### Method 2

```java
int arr[];
```

---

## Array Creation

```java
int[] arr = new int[5];
```

Creates:

```text
Index : 0 1 2 3 4
Value : 0 0 0 0 0
```

---

## Array Initialization

```java
int[] arr = {10, 20, 30, 40, 50};
```

---

## Accessing Elements

```java
System.out.println(arr[0]);
```

Output:

```text
10
```

---

## Updating Elements

```java
arr[2] = 100;
```

Before:

```text
10 20 30 40 50
```

After:

```text
10 20 100 40 50
```

---

## Traversing Array

```java
for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
}
```

---

## Length of Array

```java
System.out.println(arr.length);
```

Output:

```text
5
```

---

## Searching in Array

### Direct Access

```java
arr[3]
```

Time Complexity:

```text
O(1)
```

---

### Linear Search

```java
for(int num : arr){
    if(num == target){
        System.out.println("Found");
    }
}
```

Time Complexity:

```text
O(n)
```

---

## Summary of Arrays

```text
Homogeneous Data
Fixed Size
0 Indexed
Contiguous Memory
Fast Access O(1)
```

---

# 🔤 What is a String?

A String is a sequence of characters.

Example:

```java
String s = "Striver";
```

Visualization:

```text
Index : 0 1 2 3 4 5 6
Value : S t r i v e r
```

---

## String Declaration

```java
String s = "Hello";
```

---

## Length of String

```java
String s = "Hello";

System.out.println(s.length());
```

Output:

```text
5
```

---

## Access Characters

```java
String s = "Hello";

System.out.println(s.charAt(0));
```

Output:

```text
H
```

---

## Print All Characters

```java
for(int i = 0; i < s.length(); i++){
    System.out.println(s.charAt(i));
}
```

---

## String Concatenation

### Using +

```java
String first = "Sai";
String second = "Harsha";

System.out.println(first + second);
```

Output:

```text
SaiHarsha
```

---

### Using StringBuilder

```java
StringBuilder sb = new StringBuilder();

sb.append("Sai");
sb.append("Harsha");

System.out.println(sb);
```

Output:

```text
SaiHarsha
```

---

## String Comparison

### Equals Method

```java
String s1 = "Hello";
String s2 = "Hello";

System.out.println(s1.equals(s2));
```

Output:

```text
true
```

---

## Not Equals

```java
System.out.println(!s1.equals(s2));
```

---

## Compare Characters

```java
String s1 = "Hello";
String s2 = "Hallo";

System.out.println(s1.charAt(1) == s2.charAt(1));
```

Output:

```text
false
```

---

## String Immutability

Strings cannot be changed.

```java
String s = "Hello";

s = "World";
```

A new String is created.

---

## StringBuilder

Used when frequent modifications are required.

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");

System.out.println(sb);
```

Output:

```text
Hello World
```

---

# Difference Between Array and String

| Array                     | String                |
| ------------------------- | --------------------- |
| Stores same type elements | Stores characters     |
| Fixed Size                | Fixed Size            |
| Access using index        | Access using charAt() |
| arr.length                | s.length()            |

---

# 🎯 Viva Questions

### What is an Array?

Collection of homogeneous elements stored in contiguous memory.

---

### Why Arrays are 0 Indexed?

Simplifies memory calculation.

---

### What is Time Complexity of Accessing Array Element?

```text
O(1)
```

---

### What is a String?

Sequence of characters.

---

### How to Find Length of String?

```java
s.length();
```

---

### How to Access Character?

```java
s.charAt(index);
```

---

### Difference Between String and StringBuilder?

```text
String       → Immutable
StringBuilder → Mutable
```

---

# 🚀 Last Minute Revision

```text
ARRAY

Homogeneous
Fixed Size
0 Indexed
Contiguous Memory

Access:
arr[i]

Length:
arr.length

STRING

Sequence of Characters

Length:
s.length()

Character:
s.charAt(i)

Compare:
s1.equals(s2)

Mutable:
StringBuilder
```
