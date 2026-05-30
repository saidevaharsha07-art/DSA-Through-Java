#  HashMap

## Definition

HashMap is a data structure used to store data in the form of:

Key → Value pairs

Each key is unique and is used to access its corresponding value.

HashMap belongs to the Java Collections Framework.

---

## Why Use HashMap?

Without HashMap:

Searching an element requires traversing the array.

```text
Time Complexity = O(n)
```

Using HashMap:

```text
Search = O(1)
Insert = O(1)
Delete = O(1)
```

(Average Case)

---

# Syntax

## Declaration

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

Import:

```java
import java.util.HashMap;
```

---

# Basic Operations

## put()

Used to insert key-value pairs.

```java
map.put(1, 10);
map.put(2, 20);
map.put(3, 30);
```

Output:

```text
{1=10, 2=20, 3=30}
```

---

## get()

Used to retrieve value using key.

```java
System.out.println(map.get(2));
```

Output:

```text
20
```

---

## containsKey()

Checks whether a key exists.

```java
System.out.println(map.containsKey(2));
```

Output:

```text
true
```

---

## remove()

Deletes a key-value pair.

```java
map.remove(2);
```

Output:

```text
{1=10, 3=30}
```

---

## size()

Returns total number of entries.

```java
System.out.println(map.size());
```

Output:

```text
3
```

---

## isEmpty()

Checks whether map is empty.

```java
System.out.println(map.isEmpty());
```

Output:

```text
false
```

---

## clear()

Removes all elements.

```java
map.clear();
```

Output:

```text
{}
```

---

# Example Program

```java
import java.util.HashMap;

public class code {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Harsha");
        map.put(2, "Java");
        map.put(3, "DSA");

        System.out.println(map);

        System.out.println(map.get(2));

        System.out.println(map.containsKey(3));

        map.remove(1);

        System.out.println(map);
    }
}
```

Output:

```text
{1=Harsha, 2=Java, 3=DSA}

Java

true

{2=Java, 3=DSA}
```

---

# getOrDefault()

Used to get value if key exists.

Otherwise return default value.

Syntax:

```java
map.getOrDefault(key, defaultValue);
```

Example:

```java
map.getOrDefault(5, 0);
```

Output:

```text
0
```

---

# Traversing HashMap

## Using keySet()

```java
for(Integer key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

Output:

```text
1 -> 10
2 -> 20
3 -> 30
```

---

## Using entrySet()

```java
for(HashMap.Entry<Integer,Integer> entry : map.entrySet()) {

    System.out.println(
        entry.getKey() +
        " -> " +
        entry.getValue()
    );
}
```

Output:

```text
1 -> 10
2 -> 20
3 -> 30
```

---

# Frequency Count Using HashMap

Array:

```text
1 2 2 3 3 3
```

Program:

```java
import java.util.HashMap;

public class code {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num,
                    map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
    }
}
```

Output:

```text
{1=1, 2=2, 3=3}
```

---

# How HashMap Works

HashMap uses:

```text
Hash Function
+
Hash Table
```

Process:

```text
Key

↓

Hash Function

↓

Index Generated

↓

Store Value
```

Example:

```text
Key = 25

Hash Function

↓

Bucket Index = 5

Store at index 5
```

---

# Advantages

### Fast Searching

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

### Stores Key-Value Pairs

Useful in many interview problems.

---

# Limitations

### No Ordering

HashMap does not maintain insertion order.

Example:

```text
Inserted:

1 2 3

Output:

3 1 2
```

Order may vary.

---

### Duplicate Keys Not Allowed

Example:

```java
map.put(1,10);

map.put(1,20);
```

Output:

```text
{1=20}
```

Old value gets overwritten.

---

# Complexity Analysis

| Operation | Complexity |
|------------|------------|
| Insert | O(1) |
| Search | O(1) |
| Delete | O(1) |
| Traverse | O(n) |

---

# Applications

### 1. Frequency Counting

Count occurrences of elements.

---

### 2. Two Sum Problem

Store numbers and indices.

---

### 3. Majority Element

Find most frequent element.

---

### 4. Group Anagrams

Group similar strings.

---

### 5. Caching

Store frequently used data.

---

# Key Points

- Stores data as Key → Value pairs.
- Keys must be unique.
- Values can be duplicated.
- Average insertion/search/deletion is O(1).
- Most important hashing data structure for interviews.

---

# Interview Definition

HashMap is a data structure that stores key-value pairs and provides average O(1) time complexity for insertion, searching and deletion using hashing.

---

# LeetCode Problems

```text
LC 1   - Two Sum

LC 169 - Majority Element

LC 49  - Group Anagrams

LC 205 - Isomorphic Strings

LC 560 - Subarray Sum Equals K
```

---

# Memory Trick

```text
Need Fast Search?

Use HashMap.

Store:

Key → Value

Retrieve in O(1).
```

### One-Line Idea

👉 HashMap = Store data as Key-Value pairs for extremely fast lookup.