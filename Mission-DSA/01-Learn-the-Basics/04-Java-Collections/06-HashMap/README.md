# HashMap in Java

## What is HashMap?

HashMap is a data structure that stores data in the form of:

```text
Key → Value
```

Each key is unique and maps to a value.

HashMap is part of the Java Collections Framework.

---

## Package

```java
import java.util.HashMap;
```

---

## Declaration

```java
HashMap<Integer, String> map = new HashMap<>();
```

Example:

```java
HashMap<Integer, String> students = new HashMap<>();
```

---

## Features of HashMap

- Stores Data as Key-Value Pairs
- Keys Must Be Unique
- Values Can Be Duplicate
- Does Not Maintain Insertion Order
- Allows One Null Key
- Allows Multiple Null Values
- Uses Hashing Internally

---

## Internal Working

HashMap internally uses:

```text
Array + Linked List + Hashing
```

(Java 8+ may use Trees for large buckets)

Hash Function:

```text
Key → Hash Value → Bucket
```

---

## Important Methods

### put()

Insert key-value pair.

```java
map.put(1, "Harsha");
```

Time Complexity: O(1)

---

### get()

Returns value of key.

```java
map.get(1);
```

Output:

```text
Harsha
```

Time Complexity: O(1)

---

### remove()

Removes key-value pair.

```java
map.remove(1);
```

Time Complexity: O(1)

---

### containsKey()

Checks whether key exists.

```java
map.containsKey(1);
```

Time Complexity: O(1)

---

### containsValue()

Checks whether value exists.

```java
map.containsValue("Harsha");
```

Time Complexity: O(n)

---

### size()

Returns number of entries.

```java
map.size();
```

---

### isEmpty()

Checks whether map is empty.

```java
map.isEmpty();
```

---

### clear()

Removes all entries.

```java
map.clear();
```

---

## Example

```java
HashMap<Integer, String> map = new HashMap<>();

map.put(1, "Harsha");
map.put(2, "Sai");
map.put(3, "Java");

System.out.println(map);
```

Possible Output:

```text
{1=Harsha, 2=Sai, 3=Java}
```

---

## Traversing HashMap

### Using keySet()

```java
for(Integer key : map.keySet()){
    System.out.println(key);
}
```

---

### Using values()

```java
for(String value : map.values()){
    System.out.println(value);
}
```

---

### Using entrySet()

```java
for(Map.Entry<Integer, String> entry : map.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue());
}
```

---

## Time Complexities

| Operation | Complexity |
|------------|------------|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |
| containsKey() | O(1) |
| containsValue() | O(n) |
| size() | O(1) |

---

## Advantages

- Fast Searching
- Fast Insertion
- Fast Deletion
- Key-Value Storage
- Efficient for Frequency Counting

---

## Disadvantages

- No Ordering
- Extra Memory Usage
- Keys Must Be Unique

---

## HashMap vs HashSet

| Feature | HashMap | HashSet |
|----------|----------|----------|
| Storage | Key-Value Pair | Only Values |
| Duplicates | Keys Unique | Elements Unique |
| Null | 1 Key, Multiple Values | 1 Null Element |

---

## Real Life Applications

- Frequency Counting
- Database Records
- Student Roll Number Mapping
- Caching
- Lookup Tables

---

## Common Interview Questions

### Does HashMap allow duplicate keys?

No.

---

### Does HashMap allow duplicate values?

Yes.

---

### Does HashMap maintain insertion order?

No.

---

### Does HashMap allow null key?

Yes, one null key.

---

### Does HashMap allow null values?

Yes, multiple null values.

---

### Which data structure is used internally?

Array + Linked List + Hashing

(Java 8+: Trees for heavy collisions)

---

## DSA Applications

- Frequency Counting
- Counting Occurrences
- Finding Duplicates
- Prefix Sum Problems
- Two Sum
- Majority Element
- Longest Subarray Problems

---

## Revision Notes

- Key → Value Pair
- Unique Keys
- Duplicate Values Allowed
- Uses Hashing
- O(1) Search
- O(1) Insert
- O(1) Delete
- One Null Key Allowed
- Multiple Null Values Allowed
- Most Important Collection for DSA