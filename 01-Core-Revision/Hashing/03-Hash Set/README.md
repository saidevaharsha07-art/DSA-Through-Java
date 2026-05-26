#  HashSet

## Definition

HashSet is a collection in Java that stores only unique elements.

It does not allow duplicates and does not maintain insertion order.

HashSet is a part of the Java Collections Framework.

---

## Why Use HashSet?

Without HashSet:

```text
Searching = O(n)
Duplicate Check = O(n)
```

Using HashSet:

```text
Searching = O(1)
Insertion = O(1)
Deletion = O(1)
```

(Average Case)

---

# Import Statement

```java
import java.util.HashSet;
```

---

# Declaration

```java
HashSet<Integer> set = new HashSet<>();
```

---

# Basic Operations

## add()

Adds an element.

```java
set.add(10);
set.add(20);
set.add(30);
```

Output:

```text
[10, 20, 30]
```

---

## Duplicate Elements

```java
set.add(10);
set.add(10);
set.add(10);
```

Output:

```text
[10]
```

Duplicates are automatically ignored.

---

## contains()

Checks whether an element exists.

```java
System.out.println(set.contains(20));
```

Output:

```text
true
```

---

## remove()

Removes an element.

```java
set.remove(20);
```

Output:

```text
[10, 30]
```

---

## size()

Returns number of elements.

```java
System.out.println(set.size());
```

Output:

```text
2
```

---

## isEmpty()

Checks whether set is empty.

```java
System.out.println(set.isEmpty());
```

Output:

```text
false
```

---

## clear()

Removes all elements.

```java
set.clear();
```

Output:

```text
[]
```

---

# Example Program

```java
import java.util.HashSet;

public class code {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set);

        System.out.println(set.contains(10));

        set.remove(30);

        System.out.println(set);
    }
}
```

Output:

```text
[20, 10, 30]

true

[20, 10]
```

(Note: Order may vary.)

---

# Traversing HashSet

```java
import java.util.HashSet;

public class code {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        for(int num : set) {
            System.out.println(num);
        }
    }
}
```

Output:

```text
10
20
30
```

(Order may vary)

---

# Detect Duplicate Elements

Array:

```text
1 2 3 2 5
```

Program:

```java
import java.util.HashSet;

public class code {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,5};

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for(int num : arr) {

            if(set.contains(num)) {
                duplicate = true;
                break;
            }

            set.add(num);
        }

        System.out.println(duplicate);
    }
}
```

Output:

```text
true
```

---

# Remove Duplicates from Array

Array:

```text
1 2 2 3 3 4
```

Program:

```java
import java.util.HashSet;

public class code {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,4};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}
```

Output:

```text
[1, 2, 3, 4]
```

---

# How HashSet Works

HashSet internally uses:

```text
HashMap
+
Hash Function
```

Process:

```text
Element

↓

Hash Function

↓

Bucket Index

↓

Stored in Hash Table
```

---

# Advantages

### Unique Elements

Duplicates are not allowed.

---

### Fast Search

```text
O(1)
```

---

### Fast Insertion

```text
O(1)
```

---

### Fast Deletion

```text
O(1)
```

---

### Simple Duplicate Detection

Very useful in interview questions.

---

# Limitations

### No Ordering

HashSet does not preserve insertion order.

Example:

```text
Inserted:

10 20 30

Output:

30 10 20
```

Order may vary.

---

### No Indexing

Cannot access elements like:

```java
set.get(0);
```

Not allowed.

---

# Complexity Analysis

| Operation | Complexity |
|------------|------------|
| Add | O(1) |
| Search | O(1) |
| Remove | O(1) |
| Traverse | O(n) |

---

# Applications

### 1. Duplicate Detection

Check whether duplicates exist.

---

### 2. Remove Duplicates

Keep only unique elements.

---

### 3. Longest Consecutive Sequence

Popular interview problem.

---

### 4. Membership Testing

Check whether an element exists.

---

### 5. Set Operations

Union, Intersection and Difference.

---

# Key Points

- Stores unique elements only.
- Duplicate values are ignored.
- Does not maintain insertion order.
- Average insertion/search/deletion is O(1).
- Internally uses HashMap.
- Frequently asked in coding interviews.

---

# Interview Definition

HashSet is a collection that stores unique elements and provides average O(1) time complexity for insertion, searching and deletion using hashing.

---

# LeetCode Problems

```text
LC 217 - Contains Duplicate

LC 219 - Contains Duplicate II

LC 349 - Intersection of Two Arrays

LC 128 - Longest Consecutive Sequence
```

---

# Memory Trick

```text
Need unique elements?

Use HashSet.

Need duplicate detection?

Use HashSet.

Need fast lookup?

Use HashSet.
```

### One-Line Idea

👉 HashSet = Store unique elements with O(1) average search, insert and delete operations.